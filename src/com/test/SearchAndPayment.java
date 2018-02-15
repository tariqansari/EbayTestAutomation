package com.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.driver.Drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import uimap.EbayPage;
import org.openqa.selenium.Dimension;

public class SearchAndPayment {

	Dimension size;	
	AppiumDriver driver;
	EbayPage page;
	
	@BeforeTest
	public void setup() throws Exception
	{
		driver = Drivers.getInstance();
		page = new EbayPage();
	}
	
	
	@Test(priority=3)								// Test to search the user product
	public void searchProduct() throws Exception {
		
		// Click on Search box
		         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 driver.findElement(EbayPage.selectSearch).click();
				  
				// enter Julius Caesar
				 driver.findElement(EbayPage.productName).sendKeys("Julius Caesar");
				 
				//element.sendKeys("Julius Caesar");
				System.out.println("Search for Julius Caesar");
				/// Click on the dropdown option for the entered product
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				 driver.findElement(EbayPage.searchProd).click();

				System.out.println("list of books for juilius caesar");
				driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
				driver.findElement(EbayPage.selectProdList).click();
	}
	
	@Test(priority=4)						// Test to buy the Product
	public void buyItNow() throws Exception {
		
		Thread.sleep(5000);
		driver.findElement(EbayPage.buyItNowBtn).click();
		Thread.sleep(20000);
		
	}
	
	@Test(priority=5)						// Test to swipe the Proceed to pay landing Page
	public void swipeVertical() 
	{
		//Scroll till last and then click funcationality
		
				size = driver.manage().window().getSize();
				  System.out.println(size);
				   
				  //Find swipe start and end point from screen's with and height.
				  //Find starty point which is at bottom side of screen.
				  int starty = (int) (size.height * 0.80);
				  System.out.println(starty);
				  //Find endy point which is at top side of screen.
				  int endy = (int) (size.height * 1.0);
				  System.out.println(endy);
				  //Find horizontal point where you wants to swipe. It is in middle of screen width.
				  int startx = size.width / 2;
				  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
				  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				    TouchAction ta = new TouchAction(driver);
				    ta.press(startx, starty).waitAction().moveTo(startx, endy).release().perform();
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
	}
	@Test(priority=6)							// Test to click on Proceed to pay button
public void proceedToPay() {  
		  driver.findElement(EbayPage.proceedToPayBtn).click();
		  
	}
	
	@Test(priority=5)							// Test to perform Payment gateway Method
	public void paymentMethod() throws Exception {
		//Select Wallets card radio button and then
		
		driver.findElement(EbayPage.paymentMethod).click();
		driver.findElement(EbayPage.selectPayTM).click();
		
		driver.findElement(EbayPage.payNowBtn).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(EbayPage.closeBtn).click();
		// close the webview
	}
	
	
}
