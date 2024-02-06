package Appium_Pac;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Bitbar_app {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
	DesiredCapabilities dc = new DesiredCapabilities();
    dc.setCapability("platformName", "Android");
    dc.setCapability("appium:deviceName", "Medium Phone API 32");
    dc.setCapability("appium:skipServerInstallation","true");
    dc.setCapability("appium:noReset", "true");
    dc.setCapability("appium:platformVersion","12.0");
    dc.setCapability("appium:app","D:\\Appium\\bitbar-sample-app.apk");    
    
    
    URL url=new URL("http://127.0.0.1:4723/wd/hub");  // you have to go on appium server;
    AndroidDriver  driver= new AndroidDriver(url, dc);
	
	
	
	
	
	driver.findElement(By.id("com.bitbar.testdroid:id/radio1")).click();	
	Thread.sleep(1000);
WebElement rush =	driver.findElement(By.id("com.bitbar.testdroid:id/radio1"));
rush.click();
boolean isenable = rush.isEnabled();
if(isenable)
{
System.out.println("It is Enabled properly");
}else
{
System.out.println("It is not Enabled ");
}
Thread.sleep(2000);
driver.findElement(By.id("com.bitbar.testdroid:id/editText1")).sendKeys("name");

Thread.sleep(1000);
	}


}
