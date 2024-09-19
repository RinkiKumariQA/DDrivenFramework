package Module2_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_test {

	public static void main(String[] args) {
      
		//String ExpMth="July 2024";
		//String ExpDay="10";
		String Expmonth="December 2024";
		String Expdate="12";
				
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
       driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
     //  driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
       driver.findElement(By.xpath("//p[@data-cy='returnDefaultText']")).click();
       while(true)
       {
    	   String Actmonth=driver.findElement(By.xpath("//div [@class='DayPicker-Caption']")).getText();
    	   if(Actmonth.equals(Expmonth))
    	   {
    		List<WebElement>e1=   driver.findElements(By.xpath("//div [@class='dateInnerCell']/p[1]"));
    		   for(WebElement e2:e1)
    		   {
    			   String ActDate=e2.getText();
    			   if(ActDate.equals(Expdate))
    			   {
    				   e2.click();
    				   break;
    			   }
    		   }
    		 break;
    		  
    	  }
    	   else
    	   {
    		   driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
    	   }
       }
       
	}

}
