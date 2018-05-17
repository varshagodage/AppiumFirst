package first;

import java.net.MalformedURLException;

import org.apache.http.impl.conn.SystemDefaultRoutePlanner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browse1 extends browerbase{

	
	public static void main(String[] args) throws MalformedURLException{
		
		AndroidDriver<AndroidElement> driver=getbrowsercap();
		
		//String url="http://www.tothenew.com/contact-us";
		//System.out.println("http://facebook.com");
		driver.get("http://www.google.com");
		//driver.g
	}
}
