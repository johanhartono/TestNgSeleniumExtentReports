package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import setup.BaseTests;
import testrunner.LoginTests;

public class HomePage extends LoginTests {

	WebDriverWait wait = new WebDriverWait(BaseTests.driver, Duration.ofSeconds(30));

	@FindBy(className = "oxd-brand")
	static WebElement HomePageLogo;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/admin/viewAdminModule')]")
	static WebElement naviLeftAdmin;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/pim/viewPimModule')]")
	static WebElement naviLeftPIM;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/leave/viewLeaveModule')]")
	static WebElement naviLeftLeave;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/time/viewTimeModule')]")
	static WebElement naviLeftTime;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/recruitment/viewRecruitmentModule')]")
	static WebElement naviLeftRecruitment;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/pim/viewMyDetails')]")
	static WebElement naviLeftMyInfo;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/performance/viewPerformanceModule')]")
	static WebElement naviLeftPerformance;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/dashboard/index')]")
	static WebElement naviLeftDashboard;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/directory/viewDirectory')]")
	static WebElement naviLeftDirectory;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/maintenance/viewMaintenanceModule')]")
	static WebElement naviLeftMaintenance;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/claim/viewClaimModule')]")
	static WebElement naviLeftClaim;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/buzz/viewBuzz')]")
	static WebElement naviLeftBuzz;

	@FindBy(xpath = "//span[text()='Admin']")
	static WebElement pageTitleAdmin;

	@FindBy(xpath = "//span[text()='PIM']")
	static WebElement pageTitlePIM;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/form/div[3]/div/div[2]/input")
	static WebElement enterPassword;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/form/div[4]/button[1]")
	static WebElement btnConfirm;

	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button/i")
	static WebElement naviLeft;

	public HomePage(WebDriver driver) {

		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}

	public static void naviLeftAdmin() {
		naviLeftAdmin.click();
	}

	public static void naviLeftPIM() {
		naviLeftPIM.click();
	}

	public static void naviLeftLeave() {
		naviLeftLeave.click();
	}

	public static void naviLeftTime() {
		naviLeftTime.click();
	}

	public static String naviLeftAdminTitle() {
		return naviLeftAdmin.getText().toString();
	}

	public static void naviLeftRecruiment() {
		naviLeftRecruitment.click();
	}

	public static void naviLeftMyInfo() {
		naviLeftMyInfo.click();
	}

	public static void naviLeftPerformance() {
		naviLeftPerformance.click();
	}

	public static void naviLeftDashboard() {
		naviLeftDashboard.click();
	}

	public static void naviLeftDirectory() {
		naviLeftDirectory.click();
	}

	public static void naviLeftMaintenance() {
		naviLeftMaintenance.click();
		enterPassword.sendKeys("admin123");
		btnConfirm.click();
		naviLeft.click();
	}

	public static void naviLeftClaim() {
		naviLeftClaim.click();
	}

	public static void naviLeftBuzz() {
		naviLeftBuzz.click();
	}

	public static void getLogo() {
		Assert.assertEquals(true, HomePageLogo.isDisplayed());

	}

	public static String getPageTitleAdmin() {
		return pageTitleAdmin.getText();
	}

	public static String getPageTitlePIM() {
		return pageTitlePIM.getText();
	}
}
