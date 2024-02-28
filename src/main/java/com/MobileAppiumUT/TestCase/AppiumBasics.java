package com.MobileAppiumUT.TestCase;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasics extends BaseTest {

	@Test
	public void WifiSettingsName() throws MalformedURLException, InterruptedException {

		// Actual Automation
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		Thread.sleep(5000);
		
	}

}
