package testing;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
//@Test
public class RealConnectedDevices  {


		public static void main(String[] args) throws InterruptedException, MalformedURLException  {
		
			  UiAutomator2Options options = new UiAutomator2Options();

		        options.setDeviceName("Android Device");
		        options.setUdid("R9ZY60NJL9A");        // Your real device UDID
		        options.setAutomationName("UiAutomator2");
		        options.setAppPackage("com.android.settings");
		        options.setAppActivity(".Settings");

		     
					    URL url = new URL(" http://127.0.0.1:4723/");
					    
					    AndroidDriver driver = new AndroidDriver(url, options);
					        
				
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				
				WebElement inputusr = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Username\"]"));
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
				
				driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]")).click();	
				
		}
		}



