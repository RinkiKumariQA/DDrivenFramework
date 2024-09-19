package TestNG;

import org.testng.annotations.Test;

public class Attribute_Description
{
    @Test(description="testing ")
    void m1()
    
    {
    	System.out.println("Attributes of TestNG");
    }
    
    @Test(description="attributes")
    void m2()
    {
    	System.out.println("Attributes of TestNG1");
    }
    
}
