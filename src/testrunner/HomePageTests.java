//Scenario: Testing all Left Navigation menus to ensure all it works correctly

package testrunner;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import setup.BaseTests;
import setup.utils;

public class HomePageTests  extends BaseTests {
	
	HomePage objHomePage;
	LoginPage objLogin;

	@Test(priority = 0, enabled = true)
	public void TestNaviLeftMenu() throws InterruptedException {
		objLogin = new LoginPage(driver);
		objLogin.login(utils.webUserName, utils.webPassword);
		Thread.sleep(1500);
		
	}
	
	@Test(priority = 1, enabled = true)
	public void TestNaviLeftMenuAdmin() throws InterruptedException  {
		objHomePage = new HomePage(driver);
		Thread.sleep(1500);
		HomePage.naviLeftAdmin();
		String getLeftNavAdminTitle = HomePage.naviLeftAdminTitle();
		Assert.assertEquals(getLeftNavAdminTitle, "Admin");
		
	}
	@Test(priority = 2, enabled = true)
	public void TestNaviLeftMenuPIM() {
		HomePage.naviLeftPIM();
	}
	@Test(priority = 3, enabled = true)
	public void TestNaviLeftMenuLeave() {
		HomePage.naviLeftLeave();
	}
	
	@Test(priority = 4, enabled = true)
	public void TestNaviLeftMenuTime() {
		HomePage.naviLeftTime();
	}
	@Test(priority = 5, enabled = true)
	public void TestNaviLeftMenuRecruitment() {
		HomePage.naviLeftRecruiment();
	}
}