package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_getalloptions {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement E1=driver.findElement(By.tagName("select"));
		Select s1=new Select(E1);
		List<WebElement>op=s1.getOptions();
		for(WebElement op2:op)
		{
		System.out.println(op2.getText());
		}

		
		
	}

}
