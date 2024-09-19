package DB_Connection;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid_Test 
{
	
   public WebDriver driver;
   public DesiredCapabilities cap;
  @Parameters("browser")
  @BeforeTest
  public void setup(String browser) throws MalformedURLException
  {
	  cap=new DesiredCapabilities();
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  ChromeOptions op=new ChromeOptions();	
		   op.addArguments("--incognito");
		   cap.setBrowserName("chrome");
		   cap.merge(op);
	  
	   }
	  else if(browser.equalsIgnoreCase("edge"))
	  {
		  EdgeOptions op=new EdgeOptions();
		//  op.addArguments();
		  cap.setBrowserName("edge");
		  cap.merge(op);
		  
	  }
	  
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  FirefoxOptions op=new FirefoxOptions();
		  op.addArguments("--incognito");
		  cap.setBrowserName("firefox");
		  cap.merge(op);
	  }
	  
	  
	  driver=new RemoteWebDriver(new URL ("http://192.168.1.50:4444/"),cap);
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  
  }
	  
         @Test
          void m1()
     {
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
           driver.findElement(By.id("password")).sendKeys("secret_sauce");
         driver.findElement(By.id("login-button")).click();
  }
          @Test
         void m2()
       {
              driver.findElement(By.linkText("Sauce Labs Backpack")).click();
     }

   
} 
