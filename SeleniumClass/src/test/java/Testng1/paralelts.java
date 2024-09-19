package Testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class paralelts 

{ 
	 void Tes()
	    {
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("http://test.rubywatir.com/radios.php");
	    }
	    
	    @Test
	    void Tst()
	    {
	    	WebDriver driver = new ChromeDriver();
	    	driver.get("https://sellglobal.ebay.in/seller-center/");
	    }

}
