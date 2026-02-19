package testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class javaApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
			 DesiredCapabilities cap = new DesiredCapabilities();
			 cap.setCapability("platformName", "Android");
			  cap.setCapability("automationName", "UiAutomator2");
			  cap.setCapability("deviceName", "emulator-5554");
			  cap.setCapability("app", "C:\\Users\\Admin\\Downloads\\app-release 28.apk");
			  cap.setCapability("autoGrantPermissions", true);
			  
				    URL url = new URL("http://127.0.0.1:4723/");
				    
				    AndroidDriver driver = new AndroidDriver(url, cap);
				        
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			WebElement inputusr = driver.findElement(By.className("android.widget.EditText"));
			inputusr.clear();
			Thread.sleep(1000);
			inputusr.sendKeys("SMLwarroom_2025");
			Thread.sleep(1000);
			WebElement inputpass = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Password\"]"));
			Thread.sleep(1000);
			inputpass.clear();
			Thread.sleep(1000);
			inputpass .sendKeys("Pragathi@sml123"); 
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"\"]")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]")).click();
			Thread.sleep(7000);
      WebElement title = driver.findElement(By.xpath("	\r\n"
          		+ "//android.widget.TextView[@text=\"Health Status\"]"));
       System.out.println(title.getText());
		  driver.findElement(By.xpath("//android.widget.TextView[@text=\"Map\"]")).click();	

	}
	}

