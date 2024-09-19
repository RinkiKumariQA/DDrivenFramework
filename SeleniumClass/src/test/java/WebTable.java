import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTable
{

	public static void main(String[] args) throws Exception
	{
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://accounts.google.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("ganju@gmail.com");
	    driver.findElement(By.xpath("//span[text()='Create account']")).click();
	    driver.findElement(By.xpath("//span[text()='For my personal use']")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("MIMA");
        driver.findElement(By.xpath("//input[@aria-label='Last name (optional)']")).sendKeys("KRI");
        driver.findElement(By.xpath("//span[text()='Next']")).click();
  //      Thread.sleep(4000);
      WebElement e1=  driver.findElement(By.id("month"));
      Select sc=new Select(e1);
      sc.selectByVisibleText("July");
      driver.findElement(By.xpath("//input[@name='day']")).sendKeys("18");
      driver.findElement(By.xpath("//input[@aria-label='Year']")).sendKeys("1996");
      
     WebElement e2= driver.findElement(By.id("gender"));
     Select cc=new Select(e2);
     cc.selectByVisibleText("Male");
     driver.findElement(By.xpath("//span[text()='Next']")).click();
     driver.findElement(By.xpath("//div[text()='Create your own Gmail address']")).click();
     driver.findElement(By.xpath("//input[@aria-label='Create a Gmail address']")).sendKeys("kri098");
  //  driver.findElement(By.xpath("//span[text()='Use your existing email']")).click();
 //   driver.findElement(By.xpath("//input[@aria-label='Email address']")).sendKeys("krimimi");
  //  driver.findElement(By.xpath("//input[@aria-label='Email address']")).sendKeys("krimimi@gmail.com");
    driver.findElement(By.xpath("//span[text()='Next']")).click();
      
	}
	
	
}