package Module_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_window_authentication_Popup {

	public static void main(String[] args) throws Exception   
	{

		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
