package com.driver;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.support.ReadPropertyFile;
import io.appium.java_client.AppiumDriver;

public class Drivers {
	/*
	 * Singleton class for Driver initialization
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public static AppiumDriver driver;

	private Drivers() {
	}

	@SuppressWarnings("rawtypes")

	public static AppiumDriver getInstance() throws Exception {
		ReadPropertyFile readP = new ReadPropertyFile(".\\TestProperty.properties");
		if (driver == null) {
			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability("deviceName", readP.getData("DeviceID"));
			capabilities.setCapability("platformName", readP.getData("DevicePlatform"));
			capabilities.setCapability("platformVersion", readP.getData("PlatformVersion"));
			capabilities.setCapability("appPackage", readP.getData("AppPackage"));
			capabilities.setCapability("appActivity", readP.getData("ActivityName"));
			driver = new AppiumDriver(new URL(readP.getData("URL")), capabilities);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		return driver;
	}
}
