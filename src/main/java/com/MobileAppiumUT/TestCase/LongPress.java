package com.MobileAppiumUT.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LongPress extends BaseTest {

	@Test
	public void longPressAction() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		Thread.sleep(5000);
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		longPressAction(ele);
		String menu= driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals(menu, "Sample menu");
		//Assert.assertTrue(driver.findElement(By.id(menu)).isDisplayed());
		Thread.sleep(3000);
		

	}
}
