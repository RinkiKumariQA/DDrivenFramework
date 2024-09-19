package Module7TstNG;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_pr {
	
public static void main(String[] args) {
	
	
	WebDriver driver=new ChromeDriver();
	
    Logger lg=LogManager.getLogger("Log_pr");
    lg.info("open Browser");
	driver.get("https://practicetestautomation.com/practice-test-login/");
	lg.info("open url");
	driver.findElement(By.id("username")).sendKeys("student");
	lg.info("Enter username");
	driver.findElement(By.id("password")).sendKeys("Password123");
	lg.info("Enter password");
	driver.findElement(By.id("submit")).click();
	

}
	
		
	}

