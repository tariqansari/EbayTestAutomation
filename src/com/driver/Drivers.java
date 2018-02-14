package com.driver;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.enums.DriverType;

import io.appium.java_client.android.AndroidDriver;

public class Drivers {

	 static WebDriver  driver;	
	
	@SuppressWarnings("rawtypes")
	
	public static WebDriver initDriver(DriverType type)
	{
		switch (type) {
		case Android:
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability("deviceName", "32085ddc0f5e7177");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "6.0.1");
			
			
		    capabilities.setCapability("appPackage", "com.ebay.mobile");
		    capabilities.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
		    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			break;
		
		default:
			break;
		}
		
		
	}
}

