package com.test;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import io.appium.java_client.AppiumDriver;
import com.support.ExcelUtils;
import com.support.ReadPropertyFile;
import com.driver.Drivers;

import uimap.EbayPage;

public class LoginEbayApp {

	@SuppressWarnings("rawtypes")
	AppiumDriver driver;
	EbayPage page;
	Dimension size;
	ReadPropertyFile readP = new ReadPropertyFile(".\\TestProperty.properties");

	@BeforeTest
	public void setup() throws Exception {
		page = new EbayPage();
		driver = Drivers.getInstance();
	}

	@Test // Perform Orientation of the Screen
	public void performOrientation() throws InterruptedException {
		driver.rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
		driver.rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
	}

	@Test(priority = 1, dataProvider = "Authentication") // Test to enter user credentials and tap login
	public void loginScreenPage(String username, String password) {
		driver.findElement(EbayPage.signInBtn).click();
		driver.findElement(EbayPage.username).sendKeys(username);
		driver.findElement(EbayPage.password).sendKeys(password);
		driver.findElement(EbayPage.signInBtn).click();
		Assert.assertEquals(true, driver.findElement(EbayPage.noThanks).isDisplayed());
	}

	@Test(priority = 2) // Test to click No Thanks landing page
	public void noThanksPage() throws Exception {

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(EbayPage.noThanks).click();
	}

	@DataProvider(name = "Authentication")
	public Object[][] Authentication() throws Exception {

		Object[][] testObjArray = ExcelUtils.getTableArray(readP.getData("ExcelPath"), "TestDataSheet");
		return (testObjArray);
	}
}
