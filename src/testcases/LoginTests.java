//Scenario: Testing Login Page to ensure user name and password entered correctly

package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import setup.utils;

import pages.LoginPage;
import setup.BaseTests;

public class LoginTests extends BaseTests {

	LoginPage objLogin;
	String exptectedTitle = "OrangeHRM";
	String actualTitle;
	String expectedCopyRight = "OrangeHRM OS 5.7";

	@Test(priority = 0, enabled = true, description = "get Page Title")
	public void openWeb() throws InterruptedException {
		objLogin = new LoginPage(BaseTests.driver);
		Thread.sleep(5000);
		actualTitle = BaseTests.driver.getTitle();
		Assert.assertEquals(actualTitle, exptectedTitle);
	}

	@Test(priority = 1, enabled = true, description = "Validate Login Page Title Label")
	public void verifyLoginPageTitle() throws Throwable {
		Thread.sleep(1000);
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.contains("Login"));
	}

	@Test(priority = 2, enabled = true, description = "Validate Login Page Copyright Label")
	public void verifyCoyRight() throws Throwable {
		Thread.sleep(1000);
		String CopyRight = objLogin.getCopyRight();
		Assert.assertTrue(CopyRight.contains(expectedCopyRight));
	}

	@Test(priority = 3, enabled = false)
	public void verifyforgetPasswordLink() {

		// String expectedText= objLogin.getforgotPasswordLinkText();
		// Assert.assertTrue(expectedText.contains("Forgot your password?"));

	}
	
	@Test(priority = 4, enabled = false)
	public void verifyLinkedIn() {

		// System.out.println("Actual linkedIn Text :" + objLogin.isEnabledLinkedIn());
		// assertTrue(objLogin.isEnabledLinkedIn());

		// System.out.println("Im in skip exception");
		// throw new SkipException("Skipping this exception");
	}
	
	@Test(priority = 5, enabled = true, description = "Login using valid credentials username and password")
	public void LoginTest() {
		objLogin.login(utils.webUserName, utils.webPassword);
	}



}