package Appium_Pac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Day1_Appium {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "Pixel 4 API 31");
		URL url = new URL("http://127.0.01:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(url,dc);
	}

}
