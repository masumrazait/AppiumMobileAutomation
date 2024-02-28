package com.MobileAppiumUT.TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AccessibilityPages extends BaseTest {
	
	@Test
	public void Accessibility() throws  InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Accessibility")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Accessibility Node Provider']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Accessibility Node Querying']")).click();

		Thread.sleep(5000);
	}
}
