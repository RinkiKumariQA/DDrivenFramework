package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Selenium {

	public static void main(String[] args)
	{
        System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\RINKI\\Desktop\\Selenium.txt");
        
		
		
		
	}

}
