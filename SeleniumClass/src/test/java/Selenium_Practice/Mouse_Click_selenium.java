package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

final class Mouse_Click_selenium {

	public static void main(String[] args) throws InterruptedException
	{
       System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
       WebDriver driver =new ChromeDriver();
       driver.get("https://demoqa.com/buttons");
 //  WebElement e1=driver.findElement(By.id("doubleClickBtn"));
//   Actions ac=new Actions(driver);
 //  ac.doubleClick(e1).build().perform();
       
 //    WebElement e2=driver.findElement(By.id("rightClickBtn"));
 //  Actions ac1=new Actions(driver);
 //   ac1.contextClick(e2).perform();
       
       
       WebElement e2=driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions ac1=new Actions(driver);
        ac1.contextClick(e2).perform();
             
     
       
    
	}

}
