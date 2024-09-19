package Module2_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Particular_Screenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("WebDiver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://practicetestautomation.com/practice-test-login/");
	  WebElement e1= driver.findElement(By.id("menu-primary-items"));
	  File f1=e1.getScreenshotAs(OutputType.FILE);
	  File f2=new File("C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\Screenshot\\parti.png");
	  FileUtils.copyFile(f1, f2);
	}

}
