package TestCases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;
import base.TestBase;

public class Loginpage_test extends TestBase{

	Loginpage obj;
	
	public Loginpage_test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		obj = new Loginpage();
		
	}
	
	@Test(priority = 1)
	public void logolinktest() {
		Assert.assertEquals(true, obj.logotest());
	}
	
	@Test(priority = 2)
	public void fillformTestInvalidEmailLogin() {
		obj.hiturl();
		obj.fillform_login("email", "pwd");
		obj.hitbutton();
		Assert.assertEquals(true, obj.emailerrortest());
	}
	
	@Test(priority = 3)
	public void fillformTestEmptypwdLogin() {
		obj.hiturl();
		obj.fillform_login("marmik260197@gmail.com", "");
		obj.hitbutton();
		Assert.assertEquals(true, obj.emptypwdtest());
	}
	
	@Test(priority = 4)
	public void fillformTestErrorMsgLogin() {
		obj.hiturl();
		obj.fillform_login("marmikpatel260197@gmail.com", "pwd@sadlk123");
		obj.hitbutton();
		Assert.assertEquals(true, obj.errormsgtest());
	}
	
	@AfterMethod
	public void clearAll() {
		driver.close();
	}
	
	
}
