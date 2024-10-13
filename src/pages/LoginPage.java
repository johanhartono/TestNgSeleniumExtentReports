package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import setup.BaseTests;

public class LoginPage extends BaseTests {
	
	WebDriverWait wait = new WebDriverWait(BaseTests.driver, Duration.ofSeconds(30));

	//WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	//WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement Username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement Password;
	
	@FindBy(xpath="//h5[normalize-space()='Login']")
	WebElement titleText;
	
	@FindBy(xpath= "//img[@alt='company-branding']")
	WebElement companyBranding;
	
	@FindBy(xpath="//div[@class='orangehrm-login-logo']//img[@alt='orangehrm-logo']")
	WebElement orangeLogo;
	
	@FindBy(className = "oxd-button")
	WebElement login;
	
	@FindBy(css = "div[class='orangehrm-login-footer'] p:nth-child(1)")
	WebElement copyRight;
	

	
	// WebElement errorMessage =
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("spanMessage")));
	// WebElement forgetPasswordLink =
	// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("orangehrm-login-forgot")));

	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;

		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	public  void getcompanyBranding() {
		Assert.assertEquals(true, companyBranding.isDisplayed());
	}
	public  void getOrangeLogo() {
		Assert.assertEquals(true, orangeLogo.isDisplayed());
	}
	// Set user name in textbox
	public void setUserName(String strUserName) {
		Username.sendKeys(strUserName);
	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		Password.sendKeys(strPassword);
	}

	// Click on login button
	public void clickLogin() {
		login.click();
	}

	// Get the title of Login Page
	public String getLoginTitle() {
		return titleText.getText();
	}
	//Get Copyright
	public String getCopyRight() {
		return copyRight.getText();
	}
	// Get the text of forgotPasswordLink
	// public String getforgotPasswordLinkText() {
	// return forgetPasswordLink.getText();
	// }

	// Get the errorMessage
	// public String getErrorMessage() {
	// return errorMessage.getText();
	// }

	// Verify linkedInIcon is enabled
	// public Boolean isEnabledLinkedIn() {
	// return linkedInIcon.isEnabled();
	// }

	public void login(String strUserName, String strPasword) {

		// Fill user name
		this.setUserName(strUserName);

		// Fill password
		this.setPassword(strPasword);

		// Click Login button
		this.clickLogin();
	}
	


}