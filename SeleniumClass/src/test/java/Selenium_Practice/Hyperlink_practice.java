package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink_practice {

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.calculator.net/");
	     List<WebElement>l1= driver.findElements(By.tagName("a"));
	     System.out.println(l1.size());
	     
	     for(WebElement l2:l1)
	     {
	    	System.out.println(l2.getText()); 
	     }
	}

}
