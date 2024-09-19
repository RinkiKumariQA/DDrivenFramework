package Module2_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assingment {

	public static void main(String[] args) 
	{
		 System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver");
         WebDriver driver=new ChromeDriver();
         driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
         driver.switchTo().frame("frame1");
         driver.switchTo().frame("frame3");
         driver.findElement(By.xpath("//input[@type='checkbox']")).click();
         driver.switchTo().parentFrame();
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Java");
         
         driver.switchTo().defaultContent();
         driver.switchTo().frame("frame2");  
         WebElement e1= driver.findElement(By.id("animals"));
        Select sc= new Select(e1);
        sc.selectByValue("big baby cat");
         
	}

}
