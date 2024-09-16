package setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTests {

	public static WebDriver driver;
	public WebDriverWait wait;



	@BeforeTest
	public void setup() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        options.addArguments("--disable-features=OptimizationGuideModelDownloading,OptimizationHintsFetching,OptimizationTargetPrediction,OptimizationHints");
        //options.addArguments("--headless"); // for github CLI
        driver = new ChromeDriver(options);
        //2.get Browser URL
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //driver.get("https://johanhartono.my.id/OrangeHR");
        driver.getTitle();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));	

	}

	@AfterTest
	public void closeBrowser() {

		driver.close();

	}
}