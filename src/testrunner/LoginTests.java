package testrunner;

import org.testng.Assert;
import org.testng.annotations.Test;
import setup.utils;

import pages.LoginPage;
import setup.BaseTests;

public class LoginTests extends BaseTests {

	LoginPage objLogin;
	
	@Test(priority = 0, enabled = true)
	public void openWeb () {
		objLogin = new LoginPage(BaseTests.driver);
	}

	@Test(priority = 1, enabled = true)
	public void verifyLoginPageTitle() {

		// Create Login Page object
		

		// Verify login page text
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.contains("Login"));
	}

	@Test(priority = 2, enabled = false)
	public void verifyforgetPasswordLink() {

		// String expectedText= objLogin.getforgotPasswordLinkText();
		// Assert.assertTrue(expectedText.contains("Forgot your password?"));

	}

	@Test(priority = 3, enabled = true)
	public void HomeTest()  {

		// login to application
		//objLogin = new LoginPage(BaseTests.driver);
		objLogin.login(utils.webUserName, utils.webPassword);
		// String expectedError = objLogin.getErrorMessage();

		// Verify home page
		// Assert.assertTrue(expectedError.contains("Username cannot be empty"));
	}

	@Test(priority = 4, enabled = false)
	public void verifyLinkedIn() {

		// System.out.println("Actual linkedIn Text :" + objLogin.isEnabledLinkedIn());
		// assertTrue(objLogin.isEnabledLinkedIn());

		// System.out.println("Im in skip exception");
		// throw new SkipException("Skipping this exception");
	}
	

}