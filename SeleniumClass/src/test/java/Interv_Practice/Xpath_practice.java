package Interv_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_practice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snaffle.com.au/");
	//  Thread.sleep(6000);
	//	driver.findElement(By.xpath("//button[@title='Close']")).click();
	 WebElement e1=   driver.findElement(By.xpath("//div[@class='nav__search__mobile']"));
	 e1.sendKeys("laptop");
	    
	}

}
