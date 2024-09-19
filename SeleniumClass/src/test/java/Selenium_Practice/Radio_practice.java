package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_practice {

	public static void main(String[] args) 
	{
       System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver");
       WebDriver driver =new ChromeDriver();
       driver.get("http://test.rubywatir.com/radios.php");
   //    driver.findElement(By.className("radioclass")).click(); // using Basic Locator
      // driver.findElement(By.xpath("//input[@value='Not sure']")).click();  // using CSSSelector locator
   //  WebElement e1=  driver.findElement(By.className("radioclass"));
  //    boolean b1= e1.isSelected();
     //  {
  //  	   System.out.println(b1);  }
      
      List<WebElement>l1= driver.findElements(By.xpath("//input[@type='radio']"));
    System.out.println(l1.size());
    for(WebElement l2:l1)
    {
    	System.out.println(l2.getText());
    }
       
       
      
	}

}
