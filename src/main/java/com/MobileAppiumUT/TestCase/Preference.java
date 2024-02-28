package com.MobileAppiumUT.TestCase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class Preference extends BaseTest {
	@Test
	public void Wifi() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView")).click();
		String Title=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(Title, "WiFi settings"); 
		driver.findElement(By.id("android:id/edit")).sendKeys("masum");
		Thread.sleep(5000);
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		Thread.sleep(5000);

	}

}
