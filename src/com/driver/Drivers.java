package com.driver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Drivers {

	 static WebDriver  driver;	
	// static AndroidDriver driver;
	 
	 private Drivers()
	 {}
	
	@SuppressWarnings("rawtypes")
	
	public static WebDriver getInstance() throws MalformedURLException
	{
		
		if(driver==null)
		{
		
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability("deviceName", "32085ddc0f5e7177");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "6.0.1");
			
			
		    capabilities.setCapability("appPackage", "com.ebay.mobile");
		    capabilities.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
		    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		}
		return driver;
	}
}

