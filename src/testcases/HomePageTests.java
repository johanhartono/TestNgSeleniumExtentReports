//Scenario: Testing Home Page Functionality
package testcases;

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

	@Test(priority = 0, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftMenu() throws InterruptedException {
		objLogin = new LoginPage(driver);
		objLogin.login(utils.webUserName, utils.webPassword);
		Thread.sleep(1500);

	}

	@Test(priority = 1, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftMenuAdmin() throws InterruptedException {
		objHomePage = new HomePage(driver);
		Thread.sleep(1500);
		HomePage.naviLeftAdmin();
		String getLeftNavAdminTitle = HomePage.naviLeftAdminTitle();
		Assert.assertEquals(getLeftNavAdminTitle, "Admin");
		getPageTitle = HomePage.getPageTitleAdmin();
		Assert.assertEquals(getPageTitle, "Admin");

	}

	@Test(priority = 2, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftMenuPIM() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftPIM();
		getPageTitle = HomePage.getPageTitlePIM();
		Assert.assertEquals(getPageTitle, "PIM");
		System.out.println(HomePage.getHomePageLogo());
		
	}

	@Test(priority = 3, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftMenuLeave() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftLeave();
	}

	@Test(priority = 4, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftMenuTime() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftTime();
	}

	@Test(priority = 5, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftMenuRecruitment() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftRecruiment();
	}

	@Test(priority = 6, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftMenuMyInfo() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftMyInfo();
	}

	@Test(priority = 7, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftMenuPerformance() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftPerformance();
	}

	@Test(priority = 8, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftDashboard() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftDashboard();
	}

	@Test(priority = 9, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftDirectory() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftDirectory();
	}


	@Test(priority = 10, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftClaim() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftClaim();
	}

	@Test(priority = 11, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftBuzz() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftBuzz();

	}
	@Test(priority = 12, enabled = true, groups = "Testing Navi Left Menu functionality")
	public void TestNaviLeftMaintenance() throws InterruptedException {
		Thread.sleep(1500);
		HomePage.naviLeftMaintenance();
		//Return to NaviLeftDashboard
		Thread.sleep(1500);
		HomePage.naviLeftDashboard();
	}

	@Test(priority = 13, enabled = true, groups = "Dashboard")
	public void TestDashBoardLabel() throws InterruptedException {
		Assert.assertEquals(HomePage.getDashLabel(), "Dashboard");
	}
	@Test(priority = 14, enabled = true, groups = "Dashboard")
	public void TestDashBoardDropDownMenu() throws InterruptedException {
		HomePage.dashDropDown();
	}
	/*@Test(priority = 15, enabled = true, groups = "Dashboard")
	public void TestDashBoardDropDownMenuAbout() throws InterruptedException {
		HomePage.dashDropDownAbout();
		Thread.sleep(5000);
		HomePage.dashDropDowanAboutClose();
		Thread.sleep(5000);
	}*/
	@Test(priority = 16, enabled = true, groups = "Dashboard")
	public void TestDashBoardDropDownMenuChangePassword() throws InterruptedException {
		Thread.sleep(5000);
		HomePage.dashDropDownChangePassword();
		Thread.sleep(3000);
		HomePage.btnChangePasswordCancel();
	}
	@Test(priority = 17, enabled = true, groups = "Dashboard")
	public void TestDashBoardDropDownMenuLogout() throws InterruptedException {
		Thread.sleep(5000);
		HomePage.dashDropDownLogout();
	}
}