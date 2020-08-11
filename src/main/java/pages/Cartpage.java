package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Cartpage extends TestBase {
	
	Actions actions = new Actions(driver);
	
	//Page Factory
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[1]/div[2]/form/div/input")
	WebElement searchinput;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[1]/div[2]/form/div/button[2]")
	WebElement searchbtn;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[3]/div/div/div/div/div[7]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/a")
	WebElement grapeslink;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div[3]/div/div[2]/div/div/div[2]/div/button")
	WebElement closebtn;
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/button[1]")
	WebElement addtocartbtn;
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[2]/button[1]")
	WebElement checkoutbtn;
	
	//Initializing page object
	public Cartpage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void searchentry(String input) {
		searchinput.sendKeys(input);
		
		actions.moveToElement(searchbtn).click().perform();
		
		waituntilelement("/html/body/div[1]/div[1]/div[3]/div/div/div/div/div[7]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/a");
		
		waituntilelement("/html/body/div[1]/div/div[3]/div/div/div[3]/div/div[2]/div/div/div[2]/div/button");
		
		scrollDownSection2();
		
		waituntilelement("/html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/button[1]");
		
		waituntilelement("/html/body/div[1]/div/div[4]/div/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/div[2]/button[1]");
	}

}
