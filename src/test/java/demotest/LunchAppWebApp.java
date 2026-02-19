package demotest;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LunchAppWebApp {

    static AndroidDriver driver;

    public static void main(String[] args) throws Exception {

        DesiredCapabilities db = new DesiredCapabilities();
        db.setCapability("platformName", "Android");
        db.setCapability("deviceName", "emulator-5554");
        db.setCapability("automationName", "UiAutomator2");
        db.setCapability("app", "C:\\Users\\Admin\\Downloads\\app-release 32 (2).apk");

        URL url = new URL("http://127.0.0.1:4723/");

        driver = new AndroidDriver(url, db);

        System.out.println("APK launched successfully");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Login
        driver.findElement(By.xpath("//android.widget.EditText[@text='Username']")).sendKeys("9180000019");

       
        driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("9180000019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Login']")).click();
    }
}