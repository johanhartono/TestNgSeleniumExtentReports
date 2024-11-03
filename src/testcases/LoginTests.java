//Scenario: Testing Login Page to ensure user name and password entered correctly

package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import setup.BaseTests;
import setup.utils;

public class LoginTests extends BaseTests {

	LoginPage objLogin;

	@Test(priority = 1, enabled = true, description = "Login using valid credentials username and password")
	public void LoginTest() {
		objLogin = new LoginPage(driver);
		objLogin.login(utils.webUserName, utils.webPassword);
		objLogin.clickLogin();
		}



}