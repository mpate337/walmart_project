package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Loginpage extends TestBase {
	
	Actions actions = new Actions(driver);
	
	//Page Factory
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div[2]/a/div")
	WebElement logo;
	
	@FindBy(id="login-form-email")
	WebElement emailinput;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/div[1]/section[3]/form/fieldset/label[3]/input")
	WebElement emailerror;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/div[1]/section[3]/form/fieldset/label[3]/input")
	WebElement pwdinput;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/div[1]/section[3]/form/fieldset/label[3]/span[2]")
	WebElement pwderror;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/section/section/div[1]/section[3]/form/fieldset/label[1]/div/p")
	WebElement errormsg;
	
	@FindBy(id="account-signin-btn")
	WebElement signin_btn;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/span/a")
	WebElement loginlink;
	
	//Initializing page object
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public Boolean logotest() {
		driver.get("https://www.walmart.ca/en");
		return logo.isDisplayed();
	}
	
	public void hiturl() {
		actions.moveToElement(loginlink).click().perform();
	}
	
	public void fillform_login(String email, String pwd) {

		emailinput.sendKeys(email);
		pwdinput.sendKeys(pwd);
	}
	
	public void hitbutton() {	
		scrollDownSection2();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 3000);");
		
		actions.moveToElement(signin_btn).click().perform();
	}
	
	public Boolean emailerrortest() {		
		
		System.out.println(emailerror.getText());
		return emailerror.isDisplayed();
	}
	
	public Boolean emptypwdtest() {

		System.out.println(pwderror.getText());		
		return pwderror.isDisplayed();
	}
	
	public Boolean errormsgtest() {
		
		System.out.println(errormsg.getText());
		return errormsg.isDisplayed();
	}

}
