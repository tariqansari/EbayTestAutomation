package com.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.driver.Drivers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import uimap.EbayPage;
import org.openqa.selenium.Dimension;

public class SearchAndPayment {

	@SuppressWarnings("rawtypes")
	AppiumDriver driver;
	EbayPage page;
	Dimension size;

	@BeforeTest
	public void setup() throws Exception {
		driver = Drivers.getInstance();
		page = new EbayPage();
	}

	@Test(priority = 3) // Test to search the user product
	public void searchProduct() throws Exception {
		driver.findElement(EbayPage.selectSearch).click();
		driver.findElement(EbayPage.productName).sendKeys("Julius Caesar");
		driver.findElement(EbayPage.searchProd).click();
		driver.findElement(EbayPage.selectProdList).click();
		Assert.assertEquals(true, driver.findElement(EbayPage.buyItNowBtn).isDisplayed());
	}

	@Test(priority = 4) // Test to buy the Product
	public void buyItNow() throws Exception {

		driver.findElement(EbayPage.buyItNowBtn).click();

	}

	@SuppressWarnings("deprecation")
	@Test(priority = 5) // Test to swipe the Proceed to pay landing Page
	public void swipeVertical() {

		size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.90);
		int endy = (int) (size.height * .40);
		int startx = size.width / 2;
		System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
		@SuppressWarnings("rawtypes")
		TouchAction ta = new TouchAction(driver);
		ta.press(startx, starty).waitAction().moveTo(startx, endy).release().perform();

	}

	@Test(priority = 6) // Test to click on Proceed to pay button
	public void proceedToPay() {
		driver.findElement(EbayPage.proceedToPayBtn).click();

	}

	@Test(priority = 7) // Test to perform Payment gateway Method
	public void paymentMethod() throws Exception {

		driver.findElement(EbayPage.paymentMethod).click();
		driver.findElement(EbayPage.selectPayTM).click();
		driver.findElement(EbayPage.payNowBtn).click();
		driver.findElement(EbayPage.closeBtn).click();

	}
}
