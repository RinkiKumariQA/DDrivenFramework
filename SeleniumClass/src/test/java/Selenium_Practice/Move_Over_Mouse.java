package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_Over_Mouse {

	public static void main(String[] args)
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
	       WebDriver driver =new ChromeDriver();
	       driver.get("https://sellglobal.ebay.in/seller-center/");
	   WebElement e1=  driver.findElement(By.linkText("Performance"));
	   Actions ew=new Actions(driver);
	    ew.moveToElement(e1).build().perform();
	    
}

}
