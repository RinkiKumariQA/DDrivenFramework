package Module_3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScrExc_Browser_Window_Related {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://practicetestautomation.com/practice-test-login/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
//Hit URL
		js.executeScript("window.location='https://www.calculator.net/'");
//To scrollBy down the webpage by pixel
		js.executeScript("window.scrollBy(0,250)");
		
//To scrollTo down the webpage by pixel
		js.executeScript("window.scrollTo(0,250)");
		
//To scroll down the webpage at the bottom of the page. By using scrollBy().
		js.executeScript("window.scrollBy(0,document.body.scrollHeight )");
	
		
//To scroll down the webpage at the top of the page.by using scrollBy()
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight )");
		
//To scroll down the webpage at the bottom of the page. By using scrollTo().
		js.executeScript("window.scrollTo(0,document.body.scrollHeight )");
		
//To scroll down the webpage at the top of the page.by using scrollBy()
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight )");
		
//To Zoom page
		js.executeScript("document.body.style.zoom='50%'");
		
//To get the heigth and width of a webpage
		String Hieght=js.executeScript("return window.innerHeight;").toString();
		System.out.println(Hieght);
		
		String Width=js.executeScript("return window.innerWidth;").toString();
		System.out.println(Width);
		
//To genarte the Alert pop window
		js.executeScript("alert('JavaScript-Test');");


	}

}
