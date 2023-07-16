package appiumtests;

import java.io.File;
import java.net.MalformedURLException;

import java.net.URL;
import org.xml.sax.SAXException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestAPISDemos {

	
	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException , InterruptedException{
		// TODO Auto-generated method stub
		
		
		//ACTIVITY & PACKAGES
		//File app = new File("./app/ApiDemos.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
         
	cap.setCapability(MobileCapabilityType.DEVICE_NAME , "Android");
   // cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
  //  cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ApiDemos");

    //for Dialer of mobile
    cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.contacts");
    cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.TwelveKeyDialer ");

       
    //7250634942
    driver = new AndroidDriver (new URL ("http://127.0.0.1:4723/wd/hub"), cap);
    System.out.println("is insan ke sath prank hone wala hai ");
    System.out.println("------------------------"
    		+ "-------------------------"
    		+ "----------------------");
  /*  
    driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"seven,PQRS\"]")).click();
    driver.findElement(By.id("com.android.contacts:id/two")).click();
    driver.findElement(By.id("com.android.contacts:id/five")).click();
    driver.findElement(By.id("com.android.contacts:id/zero")).click();
    driver.findElement(By.id("com.android.contacts:id/six")).click();
    driver.findElement(By.id("com.android.contacts:id/three")).click();
    driver.findElement(By.id("com.android.contacts:id/four")).click();
    driver.findElement(By.id("com.android.contacts:id/nine")).click();
    driver.findElement(By.id("com.android.contacts:id/four")).click();
    driver.findElement(By.id("com.android.contacts:id/two")).click();
    */
    
   // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.OriginalViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]")).sendKeys("7250634942");
   // WebElement phone = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.viewpager.widget.OriginalViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]")); phone.sendKeys("123456789");
    
    String[] num = {"7", "2", "5", "0", "6", "3", "4", "9", "4", "2"};

    NumberToWordConverter obj=new NumberToWordConverter();
    for(int i=0; i<num.length;i++) {
    	int number =Integer.parseInt(num[i]);
        driver.findElement(By.id("com.android.contacts:id/"+obj.convert(number))).click();
        
        
    }
    

    driver.findElement(By.id("com.android.contacts:id/call_sim1")).click();
    
    for(int j=10; j>=1;j--) {
        Thread.sleep(1000);
        System.err.println(j);
    }
    
    driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"End\"]/android.widget.ImageView")).click() ;
     System.out.println("Ho gaya bhai prank");
 
    Thread.sleep(2000);

    
    
    
    
    
    
    
    
    
    
    
    
  //  driver.quit();
	}

}
