package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_mouse {

	public static void main(String[] args) 
	{
      System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://demoqa.com/buttons");
  WebElement e1=    driver.findElement(By.id("iUNsd")) ;
  Actions at=new Actions(driver);
    at.click(e1).build().perform();
      
	}

}
