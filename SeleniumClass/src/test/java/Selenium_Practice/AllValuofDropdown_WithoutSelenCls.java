package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllValuofDropdown_WithoutSelenCls {

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	driver.findElement(By.xpath("//a[@title='DropDown Menu']")).click();
		
		List<WebElement>l1=driver.findElements(By.tagName("select"));
		for(WebElement l2:l1)
		{
			System.out.println(l2.getText());
		}

	}

}
