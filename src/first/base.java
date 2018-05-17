package first;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AppiumDriverLocalService appiumService=AppiumDriverLocalService.buildDefaultService();
		appiumService.start();
		
		File folder=new File("src");
		File file=new File(folder,"ApiDemos-debug.apk");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"aio_otfp");
		cap.setCapability(MobileCapabilityType.APP,file.getAbsolutePath());
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Animation']").click();;
		//driver.findElementByXPath("(//android.widget.TextView)[4]").click();

		//driver.findElementsByClassName("android.widget.TextView").get(4).click();
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		
	}

}
