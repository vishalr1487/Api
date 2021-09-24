package com.demo.flipkart.basetest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FlipkartBaseTest {
	public static AppiumDriver<MobileElement> driver;

	@BeforeSuite(alwaysRun = true)
	public void setUp() throws Exception {
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("device", "Android");
		capability.setCapability(CapabilityType.BROWSER_NAME, "");
		capability.setCapability(CapabilityType.VERSION, "7.0");
		capability.setCapability("deviceName", "Motorola");
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.flipkart.android");
		capability.setCapability("appActivity", "com.flipkart.android.SplashActivity");
		driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capability);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
}
