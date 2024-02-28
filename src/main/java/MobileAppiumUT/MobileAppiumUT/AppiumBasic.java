package MobileAppiumUT.MobileAppiumUT;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasic extends BaseTest {

	@Test
	public void AppiumTest() throws MalformedURLException, InterruptedException {

		// Test Case Start
		ConfigureAppium();
		//Language
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		Thread.sleep(5000);
		/*
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[1]")).click();
		driver.findElement(AppiumBy.className("android.widget.RelativeLayout")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Next_Button\"]/android.widget.TextView")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[1]")).click();
		driver.findElement(AppiumBy.className("aandroid.widget.Button")).click();
		Thread.sleep(5000);*/
		
		tearDown();
	}
}
