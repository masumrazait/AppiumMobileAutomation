package MobileAppiumUT.MobileAppiumUT;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	public AndroidDriver driver;
	public AppiumDriverLocalService service;

	@BeforeTest
	public void ConfigureAppium() throws MalformedURLException {

		// Set the path to the APPIUM JavaScript file
		String appiumJSPath = "C://Users//masum//AppData//Roaming//npm//node_modules//appium//build//lib//main.js";
		//String Application = "D://My_Project//Appium_Mobile_Testing//MobileAppiumUT//src//main//java//resources//prankebank_v155_1683022822.apk";

		//String Application = "D://My_Project//Appium_Mobile_Testing//MobileAppiumUT//src//main//java//resources//Western_Union_Send_Money_4.7_latestmodapks.com_.apk";

		String Application = "D://My_Project//Appium_Mobile_Testing//MobileAppiumUT//src//main//java//resources//ApiDemos-debug.apk";

		// Create the APPIUM service builder
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File(appiumJSPath))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("masumphone");
		options.setApp(Application);
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
	}

	@AfterClass
	public void tearDown() {
		tearDown();
		driver.quit();
		service.stop();

	}

}
