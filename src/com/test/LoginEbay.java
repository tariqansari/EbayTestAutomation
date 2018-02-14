package com.test;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
public class LoginEbay {
	
	
	static AndroidDriver  driver;
		public static void main(String args[]) 
		{
		   // AndroidDriver  driver;	
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability("deviceName", "32085ddc0f5e7177");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "6.0.1");
			
			
	   	    capabilities.setCapability("appPackage", "com.ebay.mobile");
	   	    capabilities.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
		
			//File file = new File(" C:\s\Users\\QEACOE\\EBayDemo\\EBay\\apk");
			
			//capabilities.setCapability("app", file.getAbsolutePath());
			
			 try
	 	    {
	 	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 	        System.out.println("Started");
	 	    }
	 	    catch (Exception ex)
	 	    {
	 	        ex.printStackTrace();
	 	    }	
			

	}
		public void homePageLandingScreen() throws Exception {
			System.out.println("Enter 1");
			Thread.sleep(10000);
			driver.findElement(By.id("com.ebay.mobile:id/button_sign_in"));
			
			//driver.findElementById("com.ebay.mobile:id/button_sign_in");
			//com.ebay.mobile:id/button_sign_in
			//driver.findElementById("com.ebay.mobile:id/sign_in_title");
			System.out.println("Enter 11");
			
		}
		
		public void signInScreen() {
			
			driver.findElementById("com.ebay.mobile:id/edit_text_username");
			System.out.println("Enter 2");
			
			
			driver.findElementById("com.ebay.mobile:id/edit_text_password");
			System.out.println("Enter 3");
			
			driver.findElementById("com.ebay.mobile:id/button_sign_in");
			System.out.println("Enter 4");
		}

		public void searchProduct() {
			
			
			
		}
		
		public void buyProduct() {
			
			
		}

		
}



/*sign in title
resourceid : com.ebay.mobile:id/sign_in_title 
text : Sign in 

username
resourceid : com.ebay.mobile:id/edit_text_username 

password
resourceid : com.ebay.mobile:id/edit_text_password

signin button
resourceid : com.ebay.mobile:id/button_sign_in 
*/






/*Swipes
The below code covers both horizontal and Vertical Swipes.
Using Co-ordinates
TouchAction action = new TouchAction(driver);
action.press(165, 157).moveTo(101, 3).release().perform();
Using Elements
WebElement ele1 =
driver.findElement(By.xpath(&quot;//XCUIElementTypeApplication[@name=&#39;UICatalog&#39;]/XCUIE
lementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther
/XCUIElementTypeTable/XCUIElementTypeCell[10]&quot;));
WebElement ele2 =
driver.findElement(By.xpath(&quot;//XCUIElementTypeApplication[@name=&#39;UICatalog&#39;]/XCUIE
lementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther
/XCUIElementTypeTable/XCUIElementTypeCell[5]&quot;));
 
  TouchAction action = new TouchAction(driver);
  action.press(ele1).moveTo(ele2).release().perform();*/



/*Gestures
Gestures like drag and drop, sliding a particular icon can be performed with the same
TouchAction.
TouchAction action = new TouchAction(driver);
action.press(125, 156).moveTo(-1671, -3).release().perform();*/


		
	


