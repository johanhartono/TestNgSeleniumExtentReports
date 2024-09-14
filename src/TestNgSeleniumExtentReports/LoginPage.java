package TestNgSeleniumExtentReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class LoginPage extends BaseTests{
 
    
    WebDriverWait wait = new WebDriverWait(BaseTests.driver, Duration.ofSeconds(30));
    WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	
    //@FindBy(name="username")
    //WebElement username;
 
    @FindBy(name="password")
    WebElement password;
 
    @FindBy(className="oxd-text")
    WebElement titleText;
 
    @FindBy(className="oxd-button")
    WebElement login;
     
    @FindBy(id="spanMessage")
    WebElement errorMessage;
     
    @FindBy(className="orangehrm-login-forgot")
    WebElement forgetPasswordLink;
     
    @FindBy(css="css=a:nth-child(1) > .oxd-icon")
    WebElement linkedInIcon;
 
    public LoginPage(WebDriver driver) {
          LoginPage.driver = driver;
 
          // This initElements method will create all WebElements
          PageFactory.initElements(driver, this);
    }
 
    // Set user name in textbox
    public void setUserName(String strUserName) {
    	username.sendKeys(strUserName);
    }
 
    // Set password in password textbox
    public void setPassword(String strPassword) {
          password.sendKeys(strPassword);
    }
 
    // Click on login button
    public void clickLogin() {
          login.click();
    }
 
    // Get the title of Login Page
    public String getLoginTitle() {
          return titleText.getText();
    }
     
    // Get the text of forgotPasswordLink
    public String getforgotPasswordLinkText() {
          return forgetPasswordLink.getText();
    }
     
    // Get the errorMessage
    public String getErrorMessage() {
          return errorMessage.getText();
    }
     
    // Verify linkedInIcon is enabled
    public Boolean isEnabledLinkedIn() {
          return linkedInIcon.isEnabled();
    }
 
    public void login(String strUserName, String strPasword) {
 
          // Fill user name
          this.setUserName(strUserName);
 
          // Fill password
          this.setPassword(strPasword);
 
          // Click Login button
          this.clickLogin();
    }
}