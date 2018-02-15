package com.test;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;
import io.appium.java_client.AppiumDriver;
import com.support.ExcelUtils;
import com.support.readPropertyFile;
import com.driver.Drivers;

import uimap.EbayPage;

public class LoginEbayApp {

	Dimension size;
	@SuppressWarnings("rawtypes")
	AppiumDriver driver;

	EbayPage page;
	readPropertyFile readP = new readPropertyFile(".\\TestProperty.properties");

	@BeforeTest
	public void setup() throws Exception {
		page = new EbayPage();
		driver = Drivers.getInstance();

	}

	@Test // Perform Orientation of the Screen
	public void performOrientation() throws InterruptedException {
		driver.rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
		System.out.println("Now screen orientation Is : " + driver.getOrientation());
		driver.rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
		System.out.println("Now screen orientation Is : " + driver.getOrientation());
	}

	@Test(priority = 1, dataProvider = "Authentication") // Test to enter user credentials and tap login
	public void loginScreenPage(String username, String password) {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(EbayPage.signInBtn).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(EbayPage.username).sendKeys(username);
		driver.findElement(EbayPage.password).sendKeys(password);
		driver.findElement(EbayPage.signInBtn).click();
		Assert.assertEquals(false, driver.findElement(EbayPage.signInBtn).isDisplayed());
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
