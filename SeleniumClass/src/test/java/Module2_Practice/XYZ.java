package Module2_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XYZ {

	public static void main(String[] args) 
	{
      /*WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.amazon.in/");
    WebElement e1=  driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
    e1.sendKeys("Mobile",Keys.ENTER);
    driver.findElement(By.id("a-autoid-1-announce")).click();
    driver.findElement(By.id("nav-cart-count")).click();
    driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();*/
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
/*WebElement	e1=driver.findElement(By.xpath("//div[@aria-label='Electronics']"));
	e1.click();*/
 WebElement e1= driver.findElement(By.className("Pke_EE"));
 e1.sendKeys("Mobile",Keys.ENTER);
 driver.findElement(By.className("KzDlHZ")).click();
 driver.findElement(By.xpath("//button[@type='button']")).click();
    
      
      
      //driver
	}

}
