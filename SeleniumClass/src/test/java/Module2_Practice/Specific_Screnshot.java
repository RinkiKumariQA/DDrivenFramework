package Module2_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specific_Screnshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("WebDiver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://practicetestautomation.com/practice-test-login/");
		  WebElement E1= driver.findElement(By.id("submit"));
		  File l1=E1.getScreenshotAs(OutputType.FILE);
		  File l2=new File("C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\Screenshot\\specific.png");
	       FileUtils.copyFile(l1, l2);

	}

}
