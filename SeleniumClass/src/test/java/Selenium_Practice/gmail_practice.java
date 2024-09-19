package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gmail_practice {

	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Divya");
	   driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	   Thread.sleep(4000);
	 WebElement e1=  driver.findElement(By.id("month"));
	   Select sc=new Select(e1);
	   sc.selectByVisibleText("September");
	   Thread.sleep(4000);
	   driver.findElement(By.id("day")).sendKeys("10");
	   driver.findElement(By.id("year")).sendKeys("2000");
	   Thread.sleep(4000);
	  WebElement e2= driver.findElement(By.id("gender"));
	  Select ss=new Select(e2);
	  ss.selectByVisibleText("Female");
	  driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("dr.divyaaa123");
	  driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Divyaa@19821");
	  driver.findElement(By.xpath("//input[@aria-label='Confirm']")).sendKeys("Divyaa@19821");
	  driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@class='VfPpkd-fmcmS-wGMbrd ']")).sendKeys("787899097");
	  
	   

	   		

		
		
		
		
		
		
		
		
		
		
	}

}
