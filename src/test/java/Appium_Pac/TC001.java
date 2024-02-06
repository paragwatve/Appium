package Appium_Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class TC001 {
	AndroidDriver driver;
  @Test(dataProvider = "dp")
  public void f(String name) throws Exception {
	  driver.findElement(By.id("com.bitbar.testdroid:id/radio1"));
	 
	  driver.findElement(By.id("com.bitbar.testdroid:id/editText1")).sendKeys(name);
	  //driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"com.bitbar.testdroid:id/editText1\"]"));
	  driver.findElement(By.id("com.bitbar.testdroid:id/button1")).click();
	  Thread.sleep(3000);
	  boolean isDisplayed=driver.findElement(By.id("com.bitbar.testdroid:id/textView2")).isDisplayed();
	  if(isDisplayed) {
		  System.out.println("passed");
	  }
	  else {
		  System.out.println("not passed");
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "Pixel XL API 34");
		dc.setCapability("skipServerInstallation", "true");
		dc.setCapability("noReset", "true");
		dc.setCapability("platformVersion", "14.0");
		dc.setCapability("app", "D:\\Training\\Appium\\bitbar-sample-app.apk");
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "parag" }
    };
  }
}