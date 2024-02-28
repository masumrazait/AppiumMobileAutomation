package MobileAppiumUT.MobileAppiumUT;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Appium {

	@Test
	public void TestApplication() throws MalformedURLException, InterruptedException {
		String appiumJSPath = "C://Users//masum//AppData//Roaming//npm//node_modules//appium//build//lib//main.js";
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File(appiumJSPath))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("masumphone");
		options.setApp("D://My_Project//Appium_Mobile_Testing//MobileAppiumUT//src//main//java//resources//ApiDemos-debug.apk");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

		// Actual Automation
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		
		Thread.sleep(5000);

		driver.quit();
		service.stop();
	}

}
