package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.support.ExcelUtils;
import com.support.readPropertyFile;
import com.driver.Drivers;

import uimap.EbayPage;

public class EbayTest {
	
	Dimension size;
	AppiumDriver driver;
	//AndroidDriver driver;
	EbayPage page;
	readPropertyFile readP = new readPropertyFile(".\\TestProperty.properties");
	
	@BeforeTest
	public void setup() throws Exception
	{
	    page = new EbayPage();
		driver = Drivers.getInstance();
		
	}


	@Test(priority=1,dataProvider="Authentication")								// Test to enter user crendentials and hit login
	public void loginScreenPage(String username, String password) {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(EbayPage.signInBtn).click();
		System.out.println("without swipe selection done");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(EbayPage.username).sendKeys(username);
		System.out.println("Enter username");
	
		driver.findElement(EbayPage.password).sendKeys(password);
		System.out.println("Enter password");
		
		driver.findElement(EbayPage.signInBtn).click();
		System.out.println("click sign in button");
		
	}
	
	@Test(priority=2)								//Test to click No Thanks landing page
	public void noThanksPage() throws Exception {
		
		// No thanks .. page Handle
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.findElement(EbayPage.noThanks).click();
				System.out.println("Click on  No thanks button");
		
	}
	
	@DataProvider(name="Authentication")

	public Object[][] Authentication() throws Exception{

	 Object[][] testObjArray = ExcelUtils.getTableArray(readP.getData("ExcelPath"),"TestDataSheet");

	 return (testObjArray);

	}
	
/*	@Test(priority=4)								// Test to search the user product
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
		//driver.swipe(toText("Proceed to Pay"));
		//driver.scrollTo("Procees to Pay");
		
				size = driver.manage().window().getSize();
				  System.out.println(size);
				   
				  //Find swipe start and end point from screen's with and height.
				  //Find starty point which is at bottom side of screen.
				  int starty = (int) (size.height * 0.20);
				  System.out.println(starty);
				  //Find endy point which is at top side of screen.
				  int endy = (int) (size.height * 0.80);
				  System.out.println(endy);
				  //Find horizontal point where you wants to swipe. It is in middle of screen width.
				  int startx = size.width / 2;
				  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
				  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				    TouchAction ta = new TouchAction(driver);
				    ta.press(startx, starty).waitAction().moveTo(startx, endy).release().perform();
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		
	}
	@Test(priority=7)							// Test to click on Proceed to pay button
public void proceedToPay() {  
		  driver.findElement(EbayPage.proceedToPayBtn).click();
		  
	}
	
	@Test(priority=8)							// Test to perform Payment gateway Method
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
		driver.findElement(EbayPage.OkBtn).click();
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
		 TouchAction ta = new TouchAction(driver);
		    ta.press(startx, starty).waitAction().moveTo(endx, starty).release().perform();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	
	


}



