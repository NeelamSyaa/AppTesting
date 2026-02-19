package basesclass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;
import java.time.Duration;

public class BaseTest {

    protected AndroidDriver driver;

    @BeforeClass
    public void setUp() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setDeviceName("Medium Phone");
        options.setAutomationName("UiAutomator2");

        options.setApp("C:\\Users\\Admin\\Downloads\\app-release 28.apk");

        options.setAutoGrantPermissions(true);
        options.setNoReset(true);

        driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options
        );

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

   // @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

