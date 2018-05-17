package first;

import com.android.uiautomator.core.UiDevice;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
//import android.support.test.uiautomator.UiSelector;

public class gestures extends base{
	
	public static void main(String[] args) throws Exception{
	
	AndroidDriver<AndroidElement> driver=Capabilities();
	
	driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
	driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	driver.findElementByAndroidUIAutomator("new UiSelector().descriptionMatches(\"9\")").click();
	//driver.findElementByXPath("//*[@content-desc='9']").click();
	TouchAction t=new TouchAction(driver);
	t.press(driver.findElementByAndroidUIAutomator("new UiSelector().descriptionMatches(\"15\")")).moveTo(driver.findElementByAndroidUIAutomator("new UiSelector().descriptionMatches(\"45\")")).release().perform();
	//driver.findElementByXPath("").
	//driver.
	
	
	 System.out.println(driver.getCurrentUrl());
	//UiDevice 
	
	}

}
