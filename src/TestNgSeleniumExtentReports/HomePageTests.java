package TestNgSeleniumExtentReports;

import org.testng.annotations.Test;

public class HomePageTests {

	HomePage objHomePage;

	@Test(priority = 3, enabled = true)
	public void TestNaviLeftMenu() {
		//objHomePage = new HomePage(BaseTests.driver);
		objHomePage.naviLeftAdmin();
	}

}