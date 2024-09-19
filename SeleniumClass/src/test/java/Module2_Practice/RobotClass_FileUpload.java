package Module2_Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass_FileUpload {

	public static void main(String[] args) throws Exception 
	{
        WebDriver driver=new ChromeDriver();
        driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
   WebElement we= driver.findElement(By.xpath("//input[@name='userfile']"));
   Actions ac=new Actions(driver);
   ac.click(we).perform();
   StringSelection ss=new StringSelection("C:\\Users\\RINKI\\Desktop\\Selenium.txt");
   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
   Robot r=new Robot();
   r.delay(3000);
   r.keyPress(KeyEvent.VK_CONTROL);
   r.keyPress(KeyEvent.VK_V);
   r.keyPress(KeyEvent.VK_ENTER);
   
   r.keyRelease(KeyEvent.VK_CONTROL);
   r.keyRelease(KeyEvent.VK_V);
   r.keyRelease(KeyEvent.VK_ENTER);
   
   
   
		
		
	}

}
