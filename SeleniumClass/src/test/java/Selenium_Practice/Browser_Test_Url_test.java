package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Test_Url_test {

	public static void main(String[] args)
	{
        System.setProperty("WebDriver.chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");  //  Browser login // URL HIT
	}

}
