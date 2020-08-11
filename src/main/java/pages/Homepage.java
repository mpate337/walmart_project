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

public class Homepage extends TestBase {
	
	//Page Factory
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div[2]/a/div")
	WebElement logo;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div/ul/li[1]/a")
	WebElement dealslink;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div/ul/li[2]/a")
	WebElement backtoschoollink;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div/ul/li[3]/a")
	WebElement outdoorlink;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div/ul/li[4]/a")
	WebElement toyslink;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div/ul/li[5]/a")
	WebElement electronicslink;
	
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div[1]/div/ul/li[6]/a")
	WebElement clothinglink;
	
	//Initializing page object
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public Boolean logotest() {
		driver.get("https://www.walmart.ca/en");
		return logo.isDisplayed();
	}
	
	public void dealstest() {
		Actions actions = new Actions(driver);
		actions.moveToElement(dealslink).click().perform();
	}
	
	public void backtoschooltest() {
		Actions actions = new Actions(driver);
		actions.moveToElement(backtoschoollink).click().perform();
	}
	
	public void outdoortest() {
		Actions actions = new Actions(driver);
		actions.moveToElement(outdoorlink).click().perform();
	}
	
	public void toystest() {
		Actions actions = new Actions(driver);
		actions.moveToElement(toyslink).click().perform();
	}
	
	public void electronicstest() {
		Actions actions = new Actions(driver);
		actions.moveToElement(electronicslink).click().perform();
	}
	
	public void clothingtest() {
		Actions actions = new Actions(driver);
		actions.moveToElement(clothinglink).click().perform();
	}

}
