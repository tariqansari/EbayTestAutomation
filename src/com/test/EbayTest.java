package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.support.*;

import com.driver.Drivers;

import uimap.EbayPage;

public class EbayTest {
	
	Dimension size;
	WebDriver driver;
	//AndroidDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		EbayPage page = new EbayPage();
		driver = Drivers.getInstance();
	}

	@Test											// Test when user launch the Ebay application
	public void login()
	{
		 // Sign in 1st page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(EbayPage.signInBtn).click();
		System.out.println("without swipe selection done");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	}
	@Test(priority=2)								// Test to enter user crendentials and hit login
	public void loginScreenPage() {
		
		// Enter username and pasword and click the sign in
		driver.findElement(EbayPage.username).sendKeys("tariq19ansari@gmail.com");
		System.out.println("Enter username");
		
		
		driver.findElement(EbayPage.password).sendKeys("Qwerty123");;
		System.out.println("Enter password");
		
		driver.findElement(EbayPage.signInBtn).click();
		System.out.println("click sign in button");
		
	}
	
	@Test(priority=3)								//Test to click No Thanks landing page
	public void noThanksPage() throws Exception {
		
		// No thanks .. page Handle
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.findElement(EbayPage.noThanks).click();
				System.out.println("Click on  No thanks button");
		
	}
	
	@Test(priority=4)								// Test to search the user product
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
	
	@Test(priority=5)						// Test to buy the Product
	public void buyItNow() throws Exception {
		
		Thread.sleep(5000);
		driver.findElement(EbayPage.buyItNowBtn).click();
		Thread.sleep(20000);
		
	}
	
	@Test(priority=6)						// Test to swipe the Proceed to pay landing Page
	public void swipeVertical() 
	{
		//Scroll till last and then click funcationality
		
		
		//Proceed to Pay
		driver.swipe(toText("Proceed to Pay"));
		
				size = driver.manage().window().getSize();
				  System.out.println(size);
				   
				  //Find swipe start and end point from screen's with and height.
				  //Find starty point which is at bottom side of screen.
				  int starty = (int) (size.height * 0.80);
				  System.out.println(starty);
				  //Find endy point which is at top side of screen.
				  int endy = (int) (size.height * 0.20);
				  System.out.println(endy);
				  //Find horizontal point where you wants to swipe. It is in middle of screen width.
				  int startx = size.width / 2;
				  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

				
				  //Swipe from Bottom to Top.
				//Object visible =(Object) driver.swipe(startx, starty, startx, endy, 3000);
				
			//	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				  //Swipe from Top to Bottom.
				//driver.swipe(startx, endy, startx, starty, 3000);
				 // Thread.sleep(2000);
		
	}
/*	@Test(priority=7)							// Test to click on Proceed to pay button
public void proceedToPay() {  
		  driver.findElement(EbayPage.proceedToPayBtn).click();
		  
	}
	
	//@Test(priority=8)							// Test to perform Payment gateway Method
	public void paymentMethod() throws Exception {
		//Select Wallets card radio button and then
		
		driver.findElement(EbayPage.paymentMethod).click();
		driver.findElement(EbayPage.selectPayTM).click();
		
		driver.findElement(EbayPage.payNowBtn).click();
		Thread.sleep(5000);
		// Click on Pay and hold for 10 sec
		
		driver.findElement(EbayPage.closeBtn).click();
		// close the webview
	}
	@Test(priority=9)							// Test to perform Sign Out
	public void signout() {
		// click on LHN an then tap small inverted arrow
		//click on signout button
		
		driver.findElement(EbayPage.lhn).click();
		driver.findElement(EbayPage.clickUser).click();
		driver.findElement(EbayPage.signOut).click();
	}
	@Test(priority=10)
	public void swipeHorizontal() {
		
		//Get the size of screen.
		size = driver.manage().window().getSize();
		System.out.println(size);

		//Find swipe start and end point from screen's with and height.
		//Find startx point which is at right side of screen.
		int startx = (int) (size.width * 0.70);
		//Find endx point which is at left side of screen.
		int endx = (int) (size.width * 0.30);
		//Find vertical point where you wants to swipe. It is in middle of screen height.
		int starty = size.height / 2;
		System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

		//Swipe from Right to Left.
		driver.swipe(startx, starty, endx, starty, 3000);
		Thread.sleep(2000);
	}

*/
}



