package Module_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationcount
{
@Test(invocationCount = 3)
 void test()
 {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
			
 }
}
