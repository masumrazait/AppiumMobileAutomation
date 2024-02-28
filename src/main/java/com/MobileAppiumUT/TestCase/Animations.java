package com.MobileAppiumUT.TestCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Animations extends BaseTest {

	@Test
	public void Hide() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Animation']")).click();
		driver.findElement(AppiumBy.accessibilityId("Hide-Show Animations")).click();
		driver.findElement(By.xpath("//android.widget.Button[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[1]")).click();
		Thread.sleep(5000);

	}

}
