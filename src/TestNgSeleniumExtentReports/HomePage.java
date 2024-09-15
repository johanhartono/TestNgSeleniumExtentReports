package TestNgSeleniumExtentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseTests {
	
	WebDriverWait wait = new WebDriverWait(BaseTests.driver, Duration.ofSeconds(30));
	WebElement naviLeftAdmin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='app']/div/div/aside/nav/div[2]/ul/li/a")));
	//xpath=//div[@id='app']/div/div/aside/nav/div[2]/ul/li/a
	


	public HomePage(WebDriver driver) {
		HomePage.driver = driver;

		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}


	public void naviLeftAdmin() {
		naviLeftAdmin.click();
		
	}
	
}
