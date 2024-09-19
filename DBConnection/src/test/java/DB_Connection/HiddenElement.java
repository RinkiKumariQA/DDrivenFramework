package DB_Connection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {

	public static void main(String[] args)
	{  
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.id("hide-textbox")).click();
	//	driver.findElement(By.id("displayed-text")).sendKeys("Hello");

		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('displayed-text').value='hello';");
	}

}
