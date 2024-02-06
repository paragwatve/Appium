package Appium_Pac;

import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Scroll {
static AndroidDriver driver;
	
	public static void scrollToEnd() {
   	 boolean canScrollMore;
		do {
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "down",
			    "percent", 3.0
			));
		
		} while(canScrollMore);
    }
    
    public static void scrollToElement(String ele) {
   	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ele\"));"));
    }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		 DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("platformName", "Android");
			dc.setCapability("deviceName", "Medium Phone API 32");
			dc.setCapability("skipServerInstallation", "true");
			dc.setCapability("noReset", "true");
			dc.setCapability("platformVersion", "12.0");
			dc.setCapability("app", "D:\\Appium\\ApiDemos-debug.apk");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver(url,dc);
			
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			Thread.sleep(2000);
			
			//scroll until view an element
			
			//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
			scrollToElement("WebView");
			
			scrollToEnd();			
	}
}
