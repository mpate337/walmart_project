package TestCases;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Signinpage;
import base.TestBase;

public class Signinpage_test extends TestBase{
		
		Signinpage obj;
		
		public Signinpage_test() {
			super();
		}
		
		@BeforeMethod
		public void setup() {
			initialization();
			obj = new Signinpage();
			
		}
		
		@Test(priority = 1)
		public void fillformTestInvalidEmail() {
			obj.hiturl();
			obj.fillform( "email", "1234567890", "firstname", "lastname", "pwdabgd123@", "pwdabgd123@" );
			obj.hitbutton();
			Assert.assertEquals(true, obj.emailerrortest());
		}
		
		@Test(priority = 2)
		public void fillformTestInvalidPhone() {
			obj.hiturl();
			obj.fillform( "email@gmail.com", "1234567", "firstname", "lastname", "pwdabgd123@", "pwdabgd123@" );
			obj.hitbutton();
			Assert.assertEquals(true, obj.phoneerrortest());
		}
		
		@Test(priority = 3)
		public void fillformTestEmptyFirstname() {
			obj.hiturl();
			obj.fillform( "email@gmail.com", "1234567890", "", "lastname", "pwdabgd123@", "pwdabgd123@" );
			obj.hitbutton();
			Assert.assertEquals(true, obj.firstnameerrortest());	
		}
		
		@Test(priority = 4)
		public void fillformTestEmptyLastname() {
			obj.hiturl();
			obj.fillform( "email@gmail.com", "1234567890", "firstname", "", "pwdabgd123@", "pwdabgd123@" );
			obj.hitbutton();
			Assert.assertEquals(true, obj.lastnameerrortest());

		}
		
		@Test(priority = 5)
		public void fillformTestWeakPwd() {
			obj.hiturl();
			obj.fillform( "email@gmail.com", "1234567890", "firstname", "lastname", "pwd", "pwd" );
			obj.hitbutton();
			Assert.assertEquals(true, obj.pwdstrengthtestWeak());
		}
		
		@Test(priority = 6)
		public void fillformTestPwdNotmatch() {
			obj.hiturl();
			obj.fillform( "email@gmail.com", "1234567890", "firstname", "lastname", "pwd@123", "pwd" );
			obj.hitbutton();
			Assert.assertEquals(true, obj.pwdnotmatcherrortest());
		}
		
		@Test(priority = 7)
		public void fillformTestTncTest() {
			obj.hiturl();
			obj.fillformTnc( "email@gmail.com", "1234567890", "firstname", "lastname", "pwd@123", "pwd@123" );
			obj.hitbutton();
			Assert.assertEquals(true, obj.tncnotclickedTest());
		}
				
		@AfterMethod
		public void clearAll() {
			driver.close();
		}
		
		
}
