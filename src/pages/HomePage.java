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
	
	//Notes
	//Original elements: <a data-v-6475d26d="" class="oxd-main-menu-item" href="/web/index.php/admin/viewAdminModule">
	//Original elements: <a data-v-6475d26d="" class="oxd-main-menu-item" href="/web/index.php/pim/viewPimModule">
	//Original elements: <a data-v-6475d26d="" class="oxd-main-menu-item" href="/web/index.php/leave/viewLeaveModule">
	//Original elements: <a data-v-6475d26d="" class="oxd-main-menu-item" href="/web/index.php/time/viewTimeModule">
	//Original elements: <a data-v-6475d26d="" class="oxd-main-menu-item" href="/web/index.php/recruitment/viewRecruitmentModule">
	//Original elements: <img data-v-16e446b0="" alt="client brand banner" src="/web/images/orangehrm-logo.png?v=1721393199309">	
	//Original elements: <span data-v-7b563373="" data-v-6475d26d="" class="oxd-text oxd-text--span oxd-main-menu-item--name">PIM</span>

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
	
	@FindBy(xpath ="//span[text()='Admin']")
	static WebElement pageTitleAdmin;

	@FindBy(xpath ="//span[text()='PIM']")
	static WebElement pageTitlePIM;

	
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
