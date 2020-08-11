package TestCases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Homepage;
import base.TestBase;

public class Homepage_test extends TestBase{

	Homepage obj;
	
	public Homepage_test() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		obj = new Homepage();
		
	}
	
	@Test(priority = 1)
	public void logolinktest() {
		Assert.assertEquals(true, obj.logotest());
	}
	
	@Test(priority = 2)
	public void dealslinktest() {
		obj.dealstest();
	}
	
	@Test(priority = 3)
	public void backtoschoollinktest() {
		obj.backtoschooltest();
	}
	
	@Test(priority = 4)
	public void outdoorlinktest() {
		obj.outdoortest();
	}
	
	@Test(priority = 5)
	public void toyslinktest() {
		obj.toystest();
	}
	
	@Test(priority = 6)
	public void electronicslinktest() {
		obj.electronicstest();
	}
	
	@Test(priority = 7)
	public void clothinglinktest() {
		obj.clothingtest();
	}
	
	@AfterMethod
	public void clearAll() {
		driver.close();
	}
	
}
