package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class Signinpage extends TestBase{
	
		Actions actions = new Actions(driver);
	
		//Page Factory
		@FindBy(id="email")
		WebElement email;
		
		@FindBy(id="phone")
		WebElement phone;
		
		@FindBy(id="firstName")
		WebElement firstname;
		
		@FindBy(id="lastName")
		WebElement lastname;
		
		@FindBy(id="password")
		WebElement pwd;
		
		@FindBy(id="confirmPassword")
		WebElement confirmpwd;
		
		@FindBy(id="tnc")
		WebElement termscond;
		
		@FindBy(id="create-account-btn")
		WebElement buttoncreateacc;
		
		@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/section[4]/div/form[2]/fieldset/label[2]/span[2]")
		WebElement emailerror;
		
		@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/section[4]/div/form[2]/fieldset/label[3]/span[3]")
		WebElement phoneerror;
		
		@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/section[4]/div/form[2]/fieldset/label[4]/span[2]")
		WebElement firstnameerror;
		
		@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/section[4]/div/form[2]/fieldset/label[5]/span[2]")
		WebElement lastnameerror;
		
		@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/section[4]/div/form[2]/fieldset/div[3]/div[2]/span[2]")
		WebElement pwdStrength;
		
		@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/section[4]/div/form[2]/fieldset/label[6]/span[2]")
		WebElement pwderror;
		
		@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/section[4]/div/form[2]/fieldset/label[7]/span[2]")
		WebElement pwdnotmatch;
		
		@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/section[4]/div/form[2]/fieldset/label[8]/span[2]")
		WebElement termsconderror;
		
		//Initializing page object
		public Signinpage() {
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		
		public void hiturl() {
			driver.get("https://www.walmart.ca/create-account");
		}
		
		public void fillform(String emailvalue, String phonevalue, String firstnamevalue, 
				String lastnamevalue, String pwdvalue, String confirmpwdvalue) {
			email.sendKeys(emailvalue);
			phone.sendKeys(phonevalue);
			firstname.sendKeys(firstnamevalue);
			lastname.sendKeys(lastnamevalue);
			pwd.sendKeys(pwdvalue);
			confirmpwd.sendKeys(confirmpwdvalue);
			
			scrollDownSection2();
			
			actions.moveToElement(termscond).click().perform();
		}
		
		public void fillformTnc(String emailvalue, String phonevalue, String firstnamevalue, 
				String lastnamevalue, String pwdvalue, String confirmpwdvalue) {
			email.sendKeys(emailvalue);
			phone.sendKeys(phonevalue);
			firstname.sendKeys(firstnamevalue);
			lastname.sendKeys(lastnamevalue);
			pwd.sendKeys(pwdvalue);
			confirmpwd.sendKeys(confirmpwdvalue);
			
			scrollDownSection2();
		}
		
		public Boolean pwdstrengthtestWeak() {		
			
			System.out.println(pwderror.getText());
			return pwderror.isDisplayed();
				
		}
		
		public void hitbutton() {	
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
			actions.moveToElement(buttoncreateacc).click().perform();
		}
		
		public Boolean emailerrortest() {	
			
			System.out.println(emailerror.isDisplayed() + emailerror.getText());
			return emailerror.isDisplayed();
		}
		
		public Boolean phoneerrortest() {
			
			System.out.println(phoneerror.isDisplayed() + phoneerror.getText());
			return phoneerror.isDisplayed();
		}
		
		public Boolean firstnameerrortest() {
			
			System.out.println(firstnameerror.isDisplayed() + firstnameerror.getText());
			return firstnameerror.isDisplayed();
		}
		
		public Boolean lastnameerrortest() {
			
			System.out.println(lastnameerror.isDisplayed() + lastnameerror.getText());
			return lastnameerror.isDisplayed();
		}
		
		public Boolean pwdnotmatcherrortest() {
			
			System.out.println(pwdnotmatch.isDisplayed() + pwdnotmatch.getText());
			return pwdnotmatch.isDisplayed();
		}
		
		public Boolean tncnotclickedTest() {
			
			System.out.println(termsconderror.isDisplayed() + termsconderror.getText());
			return termsconderror.isDisplayed();
		}
}
