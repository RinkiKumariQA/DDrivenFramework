package Module7TstNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFile {

	public static void main(String[] args) 
	{
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://practicetestautomation.com/practice-test-login/");
		  Withoutpgfact fc=new Withoutpgfact(driver);
		 fc.username("student");
		 fc.password("Password123");
		 fc.submit();
		 
		 Without wc=new Without(driver);
		   wc.logot();
	}

}
