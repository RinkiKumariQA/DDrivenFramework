package testjava;

public class NestedExcep {

	public static void main(String[] args) 
	{
       System.out.println("Language 1");
       System.out.println("Language 2");
       
       try
       {
    	   System.out.println(90/0);
    	   
       
              try 
              {
            	  System.out.println("Language 3");
            	  System.out.println("Language 4");
              }
              catch(Exception r)
              {
            	  System.out.println("Language 5");
            	  System.out.println("Language 6");
              }
       }
              
              catch(ArithmeticException v)
              {
            	  System.out.println("getting exception");
              }
                 
                 try
                 {
                	 System.out.println("Language 7");
                	 System.out.println("Language 8");
                	 System.out.println(21/0);
                 }
                 catch(Exception er)
                 {
                	 System.out.println("Language 9");
                	 System.out.println("Language 10");
                 }
                 finally
                 {
                	   System.out.println("Language 11");
                       System.out.println("Language 12"); 
                 }
              
                 System.out.println("Language 13");
                 System.out.println("Language 14");
                
	
	}
}
