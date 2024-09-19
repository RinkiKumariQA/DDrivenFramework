package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath_text_Contains {

	public static void main(String[] args)
	{
      System.setProperty("WebDriver.chrome.driver","C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.saucedemo.com/v1/");
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
      driver.findElement(By.xpath("//input[@type='submit']")).click();
   //   driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
      driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Back')]")).click();
      driver.findElement(By.xpath("//button[contains(@class,'btn_primary btn_inventory')]")).click();
	}

}
