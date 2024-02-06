package Appium_Pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Bitbar_ProjectPOM {
	WebDriver driver;
	By radiobutton1 = By.id("com.bitbar.testdroid:id/radio0");
	By radiobutton2 = By.id("com.bitbar.testdroid:id/radio1");
	By Entername = By.id("com.bitbar.testdroid:id/editText1");
	By button = By.id("com.bitbar.testdroid:id/button1");
	

	public Bitbar_ProjectPOM(WebDriver driver2) {
		this.driver=driver2;
	}
//1
	public void radiobutton101() {
		driver.findElement(radiobutton1).click();
	}
//2
	public void radiobutton2nd() {
		//driver.findElement(radiobutton2).click();
		WebElement par =	driver.findElement(radiobutton2);
		par.click();
		boolean isenable = par.isEnabled();
		if(isenable)
		{
			System.out.println("It is Enabled properly");
		}else
		{
			System.out.println("It is not Enabled ");
		}
	}
	
	
	public void enterfirstname(String firstname) {
		driver.findElement(Entername).sendKeys(firstname);
	}
	
	
	//button
	public void clickonbutton() {
		driver.findElement(button).click();
	}
	
	
}
