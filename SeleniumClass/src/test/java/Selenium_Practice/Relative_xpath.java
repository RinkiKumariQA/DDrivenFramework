package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {

	public static void main(String[] args) 
	{
		  System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://www.saucedemo.com/v1/");
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		  driver.findElement(By.xpath("//input[@class='btn_action']")).click();
		  driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']")).click();
		  driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).click();
		  driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		  driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Rima");
		  driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Roy");
		  driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("109123");
		  driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
		  driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();

	}

}
