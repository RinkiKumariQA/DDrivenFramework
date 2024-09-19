package Module2_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickImage_Practice 
{
	public static void main(String[] args)
		{
		

		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.findElement(By.xpath("//img[@title='Forbes']")).click();
		
		
		
	}
}
