package Module_4;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadClass
{
  Properties pro;
  String path="C:\\Users\\RINKI\\eclipse-workspace\\SeleniumClass\\src\\test\\java\\DataFile.properties";
  
  public ReadClass() throws Exception 
  {
	  pro=new Properties();
	  FileInputStream fn=new FileInputStream(path);
	  pro.load(fn);
  }
  
  public String geturl()
  {
	  String s1=pro.getProperty("url");
	  if(s1!=null)
	  {
		  return s1;
	  }
	  else
	  {
		  throw  new RuntimeException("url not foumd");
	  }
  }
    public String getusername()
    {
    	String s2=pro.getProperty("username");
    	if(s2!=null)
    	{
    		return s2;
    	}
    	else
    	{
    		throw new RuntimeException("username not found");
    	}
    }
    public String getpassword()
    {
    	String s3= pro.getProperty("password");
    	if(s3!=null)
    	{
    		return s3;
    	}
    	else
    	{
    		throw new RuntimeException("password not found");
    		
    	}
    }

}
