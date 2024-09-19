package TestNG_Module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parraleltesting 
{
    @Test
    void Tes()
    {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://demoqa.com/buttons");
    }
    
    @Test
    void Tst()
    {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.saucedemo.com/v1/");
    }
}
