package TestNG_Module2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprov
{
   @Test(dataProvider="DataPro")
   void test(String s1,String s2)
   {
	   System.out.println(s1+s2);
   }
   
   @DataProvider(name="DataPro")
   String[][] s1()
   
   {
	   String s[][]=new String[2][2];
	   s[0][0]="Hello";
	   s[0][1]="9";
	   s[1][0]="Mood";
	   s[1][1]="By";
	   return s;
	   
	   
   }
   
   
   
   
}
