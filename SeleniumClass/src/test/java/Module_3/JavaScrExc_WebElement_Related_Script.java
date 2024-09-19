package Module_3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrExc_WebElement_Related_Script {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//To refresh the browser
		js.executeScript("history.go(0)");
		
//To type text in text box
		js.executeScript("document.getElementById('username').value='student';");
		js.executeScript("document.getElementById('password').value='Password123';");
//To click an a button
		WebElement e1=driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].click();", e1);
		
//To Draw boarder around element
		WebElement e2=driver.findElement(By.linkText("Log out"));
		js.executeScript("arguments[0].style.border='3px solid skyblue';",e2);
		
//To scroll down the webpage by the visiblity of the element
		 WebElement e3=driver.findElement(By.linkText("Age Calculator"));
		js.executeScript("arguments[0].scrollIntoView();",e3);

	}

}
