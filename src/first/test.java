package first;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class test extends base{

	AndroidDriver<AndroidElement> driver;
	//AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
	//AppiumDriverLocalService appiumService=AppiumDriverLocalService.buildDefaultService();
	
	
	@BeforeTest
	public void setup() throws IOException, InterruptedException
	{
		//driver=Capabilities();
		//Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k appium");
		//appiumService.start();
		//service.start();
	}
	
	@Test
	public void test1() throws MalformedURLException{
		// TODO Auto-generated method stub
		
		driver.findElementByAndroidUIAutomator("text(\"App\")").click();
		//driver.close();
		

	}
	
	@Test
	public void test2() throws MalformedURLException, Exception{
		// TODO Auto-generated method stub
		
		
		driver.findElementByAndroidUIAutomator("text(\"Alarm\")").click();
		

	}
	
	@AfterTest
	public void postsetup()
	{
		//service.stop();
	}


}
