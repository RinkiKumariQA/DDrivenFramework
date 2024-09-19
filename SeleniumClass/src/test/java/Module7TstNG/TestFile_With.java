package Module7TstNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFile_With {

	public static void main(String[] args)
	{
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://practicetestautomation.com/practice-test-login/");
		//  WithPGFac fg=new WithPGFac(driver);
		//  fg.username("student");
		//  fg.password("Password123");
		//  fg.submit();
		  
		  
		//  Without ws=new Without(driver);
	//	  ws.logout();
		  
	}

}
