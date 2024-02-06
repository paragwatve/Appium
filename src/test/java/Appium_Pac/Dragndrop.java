package Appium_Pac;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

public class Dragndrop {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
	    dc.setCapability("platformName", "Android");
	    dc.setCapability("appium:deviceName", "Medium Phone API 32");
	    dc.setCapability("appium:skipServerInstallation","true");
	    dc.setCapability("appium:noReset", "true");
	    dc.setCapability("appium:platformVersion","12.0");
	    dc.setCapability("appium:app","D:\\Appium\\com.mobeta.android.demodslv_2013-01-11.apk");  

	    
	    URL url=new URL("http://127.0.0.1:4723/wd/hub");  // you have to go on appium server;
	    AndroidDriver  driver= new AndroidDriver(url, dc);
	    
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.mobeta.android.demodslv:id/activity_title\" and @text=\"Basic usage playground\"]")).click();
	    WebElement source = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(6);
		WebElement target = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle")).get(0);
		
		TouchAction action = new TouchAction(driver);
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
	    
	    
 }
}