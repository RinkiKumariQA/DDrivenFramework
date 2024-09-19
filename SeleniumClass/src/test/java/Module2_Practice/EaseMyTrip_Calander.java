package Module2_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EaseMyTrip_Calander {

	public static void main(String[] args) throws Exception 
	{
		String ExpMthYear="DEC 2024";
		String EXpDay="7";
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.easemytrip.com/");
      driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
      while(true)
      {
    	 String ActMthYear= driver.findElement(By.xpath("//div[@class='month']")).getText();
    	if(ActMthYear.equals(ExpMthYear))
    			{
    		      List<WebElement>l1= driver.findElements(By.xpath("//li[@onclick='SelectDate(this.id)']"));
    		      for(int i=0;i<l1.size();i++)
    		      {
    		    	  String d1=l1.get(i).getText();
    		    	  String a[]=d1.split("\n");
    		    	  String ActDay=a[0];
    		    	  if(ActDay.equals(EXpDay))
    		    	  {
        		    	  l1.get(i).click();
        		    	  break;

    		    	  }
    		    		  
    		      }
    		      break;
    			}
    	else
    	{
    		driver.findElement(By.id("img2Nex")).click();
    	}
    	 
      }

	}

}
