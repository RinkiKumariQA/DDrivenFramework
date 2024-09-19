package Module2_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Practice {

	public static void main(String[] args) 
	{
          System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
          WebDriver driver=new ChromeDriver();
          driver.get("file:///C:/Users/RINKI/Desktop/Prac.Tab.html");
        WebElement e1=  driver.findElement(By.xpath("//table/tbody/tr[1]/th[3]"));
        System.out.println(e1.getText());
       WebElement e2= driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
       System.out.println(e2.getText());
       WebElement e3=driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
       System.out.println(e3.getText());
       WebElement e4=driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
       System.out.println(e4.getText());
       List <WebElement> e5=driver.findElements(By.xpath("//table/tbody/tr"));
       System.out.println(e5.size());
       List <WebElement> e6=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
       System.out.println(e6.size());
       
       
       
          
	}

}
