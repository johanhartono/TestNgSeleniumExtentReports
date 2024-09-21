//Scenario: Testing all Left Navigation menus to ensure all it works correctly

package testrunner;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import setup.BaseTests;
import setup.utils;

public class HomePageTests extends BaseTests {

	HomePage objHomePage;
	LoginPage objLogin;
	String getPageTitle;

	@Test(priority = 0, enabled = true)
	public void TestNaviLeftMenu() throws InterruptedException {
		objLogin = new LoginPage(driver);
		objLogin.login(utils.webUserName, utils.webPassword);
		Thread.sleep(1500);

	}

	@Test(priority = 1, enabled = true)
	public void TestNaviLeftMenuAdmin() throws InterruptedException {
		objHomePage = new HomePage(driver);
		Thread.sleep(1500);
		HomePage.naviLeftAdmin();
		String getLeftNavAdminTitle = HomePage.naviLeftAdminTitle();
		Assert.assertEquals(getLeftNavAdminTitle, "Admin");
		getPageTitle = HomePage.getPageTitleAdmin();
		Assert.assertEquals(getPageTitle, "Admin");

	}

	@Test(priority = 2, enabled = true)
	public void TestNaviLeftMenuPIM() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftPIM();
		getPageTitle = HomePage.getPageTitlePIM();
		Assert.assertEquals(getPageTitle, "PIM");
	}

	@Test(priority = 3, enabled = true)
	public void TestNaviLeftMenuLeave() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftLeave();
	}

	@Test(priority = 4, enabled = true)
	public void TestNaviLeftMenuTime() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftTime();
	}

	@Test(priority = 5, enabled = true)
	public void TestNaviLeftMenuRecruitment() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftRecruiment();
	}

	@Test(priority = 6, enabled = true)
	public void TestNaviLeftMenuMyInfo() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftMyInfo();
	}

	@Test(priority = 7, enabled = true)
	public void TestNaviLeftMenuPerformance() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftPerformance();
	}

	@Test(priority = 8, enabled = true)
	public void TestNaviLeftDashboard() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftDashboard();
	}

	@Test(priority = 9, enabled = true)
	public void TestNaviLeftDirectory() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftDirectory();
	}

	@Test(priority = 12, enabled = true)
	public void TestNaviLeftMaintenance() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftMaintenance();
	}

	@Test(priority = 10, enabled = true)
	public void TestNaviLeftClaim() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftClaim();
	}

	@Test(priority = 11, enabled = true)
	public void TestNaviLeftBuzz() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftBuzz();
	}
}