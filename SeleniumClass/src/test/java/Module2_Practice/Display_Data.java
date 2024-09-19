package Module2_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display_Data {

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/RINKI/Desktop/Prac.Tab.html");
		List <WebElement> e1=driver.findElements(By.xpath("//table/tbody/tr"));
	     int a=e1.size();
	       List <WebElement> e2=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
	       int b=e2.size();
	       
     for(int i=2;i<=a;i++)  
     {
    	 for (int j=1;j<=b;j++)
    	 {
    		String s1= driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
    		System.out.println(s1);
    	 }
     }
     
	}

}
