package Module2_Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Window_Related_Scripts_Practice {

	public static void main(String[] args) 
	{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
   //    js.executeScript("window.location='https://www.calculator.net/'");  //  Hit URL
       
   //   js.executeScript("window.scrollBy(0,250)") //  To scrollTo down the webpage by pixel
   //   js.executeScript("window.scrollTo(0,100)"); // To scrollTo down the webpage by pixel
        

// js.executeScript("window.scrollBy(0,document.body.scrollHeight )");  //      To scroll down the webpage at the bottom of the page. By using scrollBy(). We can aslo use from using ScrollTo

   
// js.executeScript("window.scrollBy(0,-document.body.scrollHeight )"); //  To scroll down the webpage at the top of the page.by using scrollBy().We can aslo use from using ScrollTo

   //   js.executeScript("document.body.style.zoom='50%'"); //To Zoom page

        String Height=js.executeScript("return window.innerHeight;").toString();
        System.out.println(Height);
        

        String Width=js.executeScript("return window.innerWidth;").toString();
        System.out.println(Width);

     
      // To genarte the Alert pop window
        js.executeScript("alert('Alert-Test-Automation');");
        
        					
	}

}
