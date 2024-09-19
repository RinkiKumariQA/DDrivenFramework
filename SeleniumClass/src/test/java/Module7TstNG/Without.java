package Module7TstNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Without 

{
  WebDriver ldriver;
  
  public Without(WebDriver Originaldriver)
  {
	  ldriver =Originaldriver;
//	  PageFactory.initElements( Originaldriver,this);
  }
	
       By logout=By.xpath("//a[text()='Log out']");
  
  public void logot()
 {
	 ldriver.findElement(logout).click();
 }
  
  // @FindBy(xpath="wp-block-button__link has-text-color has-background has-very-dark-gray-background-color") WebElement logout1;
   
  // public void logout()
  // {
//   logout1.click();
  // }
  
	 
}
