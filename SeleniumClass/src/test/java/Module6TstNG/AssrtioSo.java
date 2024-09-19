package Module6TstNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssrtioSo {
	
	@Test
	void test()
	{
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.google.com");
	    String ExpTite="Googl";
	    String ActTitle= driver.getTitle();
	    System.out.println("ActTitle");
	    SoftAssert sa=new SoftAssert();
	    sa.assertEquals(ExpTite, ActTitle);
	   System.out.println("end of the code");
	   sa.assertAll();
	}
	

}
