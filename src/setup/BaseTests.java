package setup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTests {

	public static WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-search-engine-choice-screen");
			options.addArguments(
					"--disable-features=OptimizationGuideModelDownloading,OptimizationHintsFetching,OptimizationTargetPrediction,OptimizationHints");
			// options.addArguments("--headless"); // for github CLI
			driver = new ChromeDriver(options);
			driver.get(utils.webUrl);
			driver.getTitle();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get("https://www.johanhartono.my.id/OrangeHR");
			driver.getTitle();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			driver.get("https://www.johanhartono.my.id/OrangeHR");
			driver.getTitle();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		} 
	}

	@AfterTest
	public void closeBrowser() {

		//driver.close();

	}
}