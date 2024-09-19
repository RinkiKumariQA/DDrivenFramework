package Module2_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Practice {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("WebDiver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	       driver.get("https://practicetestautomation.com/practice-test-login/");
	       TakesScreenshot sc=driver;
	       File f1=sc.getScreenshotAs(OutputType.FILE);
     File f2= new File("C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\Screenshot\\hello12.png");
	       FileUtils.copyFile(f1, f2);
	       

	}

}
