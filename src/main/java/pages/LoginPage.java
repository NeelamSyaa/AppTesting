package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

    private AndroidDriver driver;
    private WebDriverWait wait;

    // Locators
    @AndroidFindBy(className  = "android.widget.EditText")
    private WebElement username;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.app:id/password\")")
    private WebElement password;

    @AndroidFindBy(xpath   = "//android.widget.TextView[@text=\"\"]")
    private WebElement checkbox;

    @AndroidFindBy(xpath  = "//android.widget.TextView[@text=\"Login\"]")
    private WebElement login;

    // Constructor
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        PageFactory.initElements(
                new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Actions
    public void usernametext() throws InterruptedException {
   
    
        wait.until(ExpectedConditions.visibilityOf(username));
    	username.clear();
        username.sendKeys("SMLwarroom_2025");
      	Thread.sleep(2000);
    }

    public void passwordtext() throws InterruptedException {
    	
    	wait.until(ExpectedConditions.elementToBeClickable(password)).clear();
    	wait.until(ExpectedConditions.elementToBeClickable(password)).sendKeys("Pragathi@sml123");
    }

    public void checkboxbtn() throws InterruptedException {
    	Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();
    }

    public void loginbtn() throws InterruptedException {
    	Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();
    }
}
//