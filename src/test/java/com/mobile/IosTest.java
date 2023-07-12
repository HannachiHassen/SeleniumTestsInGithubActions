package com.mobile;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.SneakyThrows;

public final class IosTest {

	public IosTest() {	}

	 @SneakyThrows
	    @Test
	    public void testAppLaunchIOS() {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS);
	        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
	        capabilities.setCapability("isHeadless",true);
	        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPod touch (7th generation)");
	        //capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/DailyCheck.zip");
	        capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"/TestApp-iphonesimulator.app");
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),
	                capabilities);
	    }
}
