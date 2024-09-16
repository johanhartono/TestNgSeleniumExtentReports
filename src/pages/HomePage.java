package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import setup.BaseTests;
import testrunner.LoginTests;

public class HomePage extends LoginTests {
	//Notes
	//Original elements: <a data-v-6475d26d="" class="oxd-main-menu-item" href="/web/index.php/admin/viewAdminModule">
	//Original elements: <a data-v-6475d26d="" class="oxd-main-menu-item" href="/web/index.php/pim/viewPimModule">
	//Original elements: <a data-v-6475d26d="" class="oxd-main-menu-item" href="/web/index.php/leave/viewLeaveModule">
	//Original elements: <a data-v-6475d26d="" class="oxd-main-menu-item" href="/web/index.php/time/viewTimeModule">
	
	
	WebDriverWait wait = new WebDriverWait(BaseTests.driver, Duration.ofSeconds(30));
	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/admin/viewAdminModule')]")
	static WebElement naviLeftAdmin;

	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/pim/viewPimModule')]")
	static WebElement naviLeftPIM;
	
	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/leave/viewLeaveModule')]")
	static WebElement naviLeftLeave;
	
	@FindBy(xpath = "//a[starts-with(@href, '/web/index.php/time/viewTimeModule')]")
	static WebElement naviLeftTime;

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

}
