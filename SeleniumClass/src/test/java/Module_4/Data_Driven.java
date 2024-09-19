package Module_4;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Driven 
{
 public WebDriver driver;
 
 @BeforeMethod
   void Browser()
   {
	 
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com");
   }
 
  @Test(dataProvider = "DataPro")
  void test(String s1,String s2)
  {
	  driver.findElement(By.id("APjFqb")).sendKeys(s1+s2,Keys.ENTER);
  }
  @DataProvider(name="DataPro")
  public String [][] getData() throws Exception
  {
	  String a[][]=getExcel();
	  return a;
  }
  
  public  String[][] getExcel() throws Exception
  {
	  String f1="C:\\Users\\RINKI\\Desktop\\A1.xlsx";
	  String a1[][]=null;
	  FileInputStream fn= new FileInputStream(f1);
	  XSSFWorkbook wb=new XSSFWorkbook(fn);
	  XSSFSheet ws=wb.getSheetAt(0);
	   int row= ws.getLastRowNum()+1;
	int col= ws.getRow(0).getLastCellNum();
	a1=new String[row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			a1[i][j]=ws.getRow(i).getCell(j).toString();
		}
	}
	return a1;
	  
  }
}
