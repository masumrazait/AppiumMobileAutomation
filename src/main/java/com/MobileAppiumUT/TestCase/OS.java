package com.MobileAppiumUT.TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class OS extends BaseTest {

	@Test(invocationCount = 5)
	public void SendMsg() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("OS")).click();
		driver.findElement(AppiumBy.accessibilityId("SMS Messaging")).click();
		driver.findElement(AppiumBy.accessibilityId("Enable SMS broadcast receiver")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).sendKeys("Masum");
		driver.findElement(By.id("io.appium.android.apis:id/sms_content")).sendKeys("RazaAmnour");
		driver.findElement(AppiumBy.accessibilityId("Send")).click();
		driver.findElement(By.id("io.appium.android.apis:id/sms_recipient")).clear();
		Thread.sleep(5000);

	}

}
