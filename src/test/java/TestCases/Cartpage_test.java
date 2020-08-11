package TestCases;

import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Cartpage;
import util.TestUtil;
import base.TestBase;

public class Cartpage_test extends TestBase{

	Cartpage obj;
	
	public Cartpage_test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		obj = new Cartpage();	
	}
	
	@Test(priority = 1)
	public void searchentryTest() {
		obj.searchentry("grapes");
	}
	
}
