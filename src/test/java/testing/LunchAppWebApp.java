package testing;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LunchAppWebApp {

	public static void main(String[] args) throws InterruptedException {
		
              DesiredCapabilities db = new DesiredCapabilities();
              db.setCapability("PlatformName", "Android");
              
              db.setCapability("Devicename", "emulator-5554");
              db.setCapability("app", "C:\\Users\\Admin\\Downloads\\app-release 32 (2).apk");
              db.setCapability("automationName", "UiAutomator2");
  
              
                 URL url = null;
				try {
					url = new URL("http://127.0.0.1:4723/");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                		 AndroidDriver driver = new AndroidDriver(url, db);
                		System.out.println( "apk is lounch is succssfully ");
                	
   // login page 
                		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Username\"]")).sendKeys("9180000019");
                		Thread.sleep(4000);
                		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Password\"]")).sendKeys("9180000019");
                		try {
							Thread.sleep(4000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                		driver.findElement(By.xpath("//android.widget.TextView[@text=\"\"]")).click();
                		
                		driver.findElement(By.xpath(
                				"//android.view.ViewGroup[@content-desc=\"Login\"")).click();

}
	

	}
