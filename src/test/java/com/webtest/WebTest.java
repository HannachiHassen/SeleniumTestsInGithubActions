package com.webtest;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import lombok.SneakyThrows;

public final class WebTest {

	public WebTest() {	}
	
	@SneakyThrows
	@Test (groups = "web")
	public void testGoogleSearchSelenoid() {
		System.out.println("username"+ System.getProperty("username"));
		System.out.println("password"+ System.getProperty("password"));
		
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("enableVNC", true);
		capabilities.setCapability("enableVideo", false);
		
		WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.get("https://google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
		Thread.sleep(10000);
		driver.quit();
	}
}
