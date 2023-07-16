package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorTest {
   
	static AppiumDriver driver;
	
	public static void main(String[] args) {
	try {
		openCalculator();
	}catch(Exception exp) {
		System.out.println(exp.getCause());
		System.out.println(exp.getMessage());
		exp.printStackTrace();
		
		
	}

	}
	public static <MobileElement> void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "Redmi Note 8");
        cap.setCapability("udid", "5091aa50");	
        cap.setCapability("platformName", "Android");	
        cap.setCapability("platformVersion", "11.0");	
        cap.setCapability("appPackage", "com.miui.calculator");	
        cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");	
	
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
	   driver = new AppiumDriver(url,cap);
	   
	   System.out.println("Application Started");
	   
      // driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"seven,PQRS\"]")).click();	   
	}

}
