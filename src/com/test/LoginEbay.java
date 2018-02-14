package com.test;
import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import uimap.EbayPage;
public class LoginEbay {
	
	
	static AndroidDriver  driver;
		public static void main(String args[]) throws Exception 
		{
			EbayPage page = new EbayPage();
		   // AndroidDriver  driver;	
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability("deviceName", "32085ddc0f5e7177");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "6.0.1");
			
			
	   	    capabilities.setCapability("appPackage", "com.ebay.mobile");
	   	    capabilities.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
		
			File file = new File("C:\\Users\\QEACOE\\EBayDemo\\EBay\\apk\\com.ebay.mobile_v5.17.0.18-117_Android-5.0.apk");
			
			capabilities.setCapability("app", file.getAbsolutePath());
			
			 try
	 	    {
	 	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 	        System.out.println("Started");
	 	    }
	 	    catch (Exception ex)
	 	    {
	 	        ex.printStackTrace();
	 	    }
			 
			 // Sign in 1st page
				System.out.println("Enter 1");
				Thread.sleep(10000);
				
				
				driver.findElement(EbayPage.signInBtn).click();
				
			// Enter username and pasword and click the sign in
				driver.findElement(EbayPage.username).sendKeys("tariq19ansari@gmail.com");;
				System.out.println("Enter username");
				
				
				driver.findElement(EbayPage.password).sendKeys("Qwerty123");;
				System.out.println("Enter password");
				
				driver.findElement(EbayPage.signInBtn).click();
				System.out.println("clcik sign in button");
				
			// No thanks .. page Handle 
				Thread.sleep(10000);
				driver.findElement(EbayPage.noThanks).click();
				System.out.println("handle No thanks button");
				
				
				// Click on Search box
				Thread.sleep(10000);
				 driver.findElement(EbayPage.selectSearch).click();
				  
				// enter Julius Caesar
				 driver.findElement(EbayPage.productName).sendKeys("Julius Caesar");
				 
				//element.sendKeys("Julius Caesar");
				System.out.println("Search for Julius Caesar");
				
				Thread.sleep(5000);
				
				/// Click on the dropdown option for the entered product
				 driver.findElement(EbayPage.searchProd).click();

				System.out.println("list of books for juilius caesar");
				
				Thread.sleep(5000);
		
				/// scroll to select the item
				
		/// Select the first product from the list
				driver.findElement(EbayPage.selectProdList).click();
				System.out.println("without swipe selection done");
				Thread.sleep(5000);
				
				/// click on image to enlarge
				
			//	driver.findElementByXPath("android.widget.ImageView[@content-desc=\'Item image 1 of 1\']").click();
				// OR  driver.findElement(By.id("com.ebay.mobile:id/imageview_image")).click();
			//	Thread.sleep(3000);
				
				//////////// Click on Buy the product
				
			//	Thread.sleep(5000);
			//	 driver.findElementById("com.ebay.mobile:id/text").click();
				 
				 
				 //////////// Click on Buy the product
					
					//Thread.sleep(10000);
					// driver.findElementById("com.ebay.mobile:id/text").click();
					 
					 
					 /////////// Perform Scroll functioanlity to button "Proceed to Pay"
					 
					 
					 
					 /////// click on "procedd to Pay"
					 //Thread.sleep(10000);
				 
				 //
				 
		
		
		}
		
		

		
}






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


		
	


