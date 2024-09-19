package Module2_Practice;

import java.util.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytrip_Calander_Test {

	public static void main(String[] args) 
	{
		String ExpMth="May 2025";
		String ExpDay="10";
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\driver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
       driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
       driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
       
       while(true)
       {
    	String ActMth= driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
    	if(ActMth.equals(ExpMth))
    	{
    		List <WebElement>e1=driver.findElements(By.xpath("//div [@class='dateInnerCell']/p[1]"));
    		for(WebElement e2:e1)
    		{
    			String ActDay=e2.getText();
    			if(ActDay.equals(ExpDay))
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
