package Module_4;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	public static WebDriver driver=null;
	 
	 @BeforeClass
	 void Browser()
	 {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	 
	 void screenShot() throws Exception
	 {
		 TakesScreenshot tc=(TakesScreenshot)driver;
		 File f1=tc.getScreenshotAs(OutputType.FILE);
		 File f2=new File("C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\Screenshot\\j1.png");
		 FileUtils.copyFile(f1,f2);
	 }
}
