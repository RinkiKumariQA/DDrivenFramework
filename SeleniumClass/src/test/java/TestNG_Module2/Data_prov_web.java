package TestNG_Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_prov_web 
{
	@Test(dataProvider = "Datapro")
	void test1(String s2)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys(s2,Keys.ENTER);
	}
	@DataProvider(name="Datapro")
      String [] m1()
      {
    	  String s2[]=new String[4];
    	   s2[0]="Automation";
    	  s2[1]="MYSQL";
    	   s2[2]="Python";
    	  s2[3]="Java";
       return s2;
    	  
      }
}
