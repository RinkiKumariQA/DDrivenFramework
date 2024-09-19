import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{
public static void main(String[] args) 
{

	String ExpMthYear="2024";
	String ExpDay="13";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.easemytrip.com/");
    WebElement e1=driver.findElement(By.id("FromSector_show"));
	//Select sc=new Select(e1);
//	sc.selectByVisibleText("Bangalore(BLR)");
    driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();
	while(true)
	{
	   String ActMthYear=  driver.findElement(By.xpath("//div[@class='month']")).getText();	
	   if(ActMthYear.equals(ExpMthYear))
	   {
		   List<WebElement> l1=driver.findElements(By.xpath("//li[@onclick='SelectDate(this.id)']"));
		   for(int i=0;i<l1.size();i++)
		   {
			   String d1=l1.get(i).getText();
			   String a[]=d1.split("\n");
			   	
			   String ActDay=a[0];
			   if(ActDay.equals(ExpDay))
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

	



	


