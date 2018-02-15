package com.test;



import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.driver.Drivers;


import io.appium.java_client.AppiumDriver;
import uimap.EbayPage;



public class Signout {
	
	
	AppiumDriver driver;
	EbayPage page;
	@BeforeTest
	public void setup() throws Exception
	{
		driver = Drivers.getInstance();
		page = new EbayPage();
	}

	@Test(priority=7)								// Test to perform Sign Out
	public void signout() {
		
		driver.findElement(EbayPage.lhn).click();
		driver.findElement(EbayPage.clickUser).click();
		driver.findElement(EbayPage.signOut).click();
		driver.findElement(EbayPage.OkBtn).click();
}
}