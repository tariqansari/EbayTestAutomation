package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.driver.Drivers;
import io.appium.java_client.AppiumDriver;
import uimap.EbayPage;

public class Signout {
	@SuppressWarnings("rawtypes")
	AppiumDriver driver;
	EbayPage page;

	@BeforeTest
	public void setup() throws Exception {
		driver = Drivers.getInstance();
		page = new EbayPage();
	}

	@Test(priority = 8) // Test to perform Sign Out
	public void signout() {

		driver.findElement(EbayPage.lhn).click();
		driver.findElement(EbayPage.clickUser).click();
		driver.findElement(EbayPage.signOut).click();
		Assert.assertEquals(true, driver.findElement(EbayPage.OkBtn).isDisplayed());
		driver.findElement(EbayPage.OkBtn).click();
	}
}