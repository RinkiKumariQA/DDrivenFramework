package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop_Practice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		//driver.findElement(By.id("alertexamples")).click();
		//driver.switchTo().alert().accept();
		
		
		//driver.findElement(By.id("confirmexample")).click();
	//	driver.switchTo().alert().dismiss();
		
		driver.findElement(By.id("promptexample")).click();
	     driver.switchTo().alert().sendKeys("Notification");
		driver.switchTo().alert().accept();
		
		
		

	}

}
