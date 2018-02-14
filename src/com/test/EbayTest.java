package com.test;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.driver.Drivers;

import uimap.EbayPage;

public class EbayTest {
	
	WebDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		EbayPage page = new EbayPage();
		driver = Drivers.getInstance();
	}

	@Test
	public void login() throws InterruptedException
	{
		 // Sign in 1st page
		System.out.println("Enter 1");
		Thread.sleep(10000);
		driver.findElement(EbayPage.signInBtn).click();
		System.out.println("without swipe selection done");
		Thread.sleep(5000);
		
		
	}
	@Test(priority=2)
	public void loginScreenPage() {
		
		// Enter username and pasword and click the sign in
		driver.findElement(EbayPage.username).sendKeys("tariq19ansari@gmail.com");;
		System.out.println("Enter username");
		
		
		driver.findElement(EbayPage.password).sendKeys("Qwerty123");;
		System.out.println("Enter password");
		
		driver.findElement(EbayPage.signInBtn).click();
		System.out.println("clcik sign in button");
		
	}
	
	@Test(priority=3)
	public void noThanksPage() throws Exception {
		
		// No thanks .. page Handle 
				Thread.sleep(10000);
				driver.findElement(EbayPage.noThanks).click();
				System.out.println("handle No thanks button");
		
	}
	
	@Test(priority=4)
	public void searchProduct() throws Exception {
		
		// Click on Search box
				Thread.sleep(10000);
				 driver.findElement(EbayPage.selectSearch).click();
				  
				// enter Julius Caesar
				 driver.findElement(EbayPage.productName).sendKeys("Julius Caesar");
				 
				//element.sendKeys("Julius Caesar");
				System.out.println("Search for Julius Caesar");
				/// Click on the dropdown option for the entered product
				 driver.findElement(EbayPage.searchProd).click();

				System.out.println("list of books for juilius caesar");
	}
	
	@Test(priority=5)
	public void productDesc() throws Exception {
		
		Thread.sleep(5000);

		/// scroll to select the item
		
        /// Select the first product from the list
		driver.findElement(EbayPage.selectProdList).click();
	}
}
