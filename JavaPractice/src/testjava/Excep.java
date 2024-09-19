package testjava;

public class Excep {

	public static void main(String[] args) 
	{	
	    int a=12;
        int b=0;
        
        System.out.println("Java");
        System.out.println("language");
        try
        {
        	System.out.println(a/b);
        }
        catch(ArithmeticException c)
        {
        
        System.out.println(c);
	}
	
        System.out.println("rest of the world");
        
        String s=null;
        System.out.println("level1");
        try
        {
        	System.out.println(s.length());
        }
        
        catch(NullPointerException e)
        {
          e.printStackTrace();
       }
        System.out.println("rest of the code");
        
       

	        System.out.println("Language 1");
            System.out.println("Language 2");
            try
            {
            	System.out.println(90/0);
            	  }
            catch(ArithmeticException d)
            {
            System.out.println(d.getMessage());
            }
            
            System.out.println("Languag 3");
            
            int r[]= {12,13,14,16};
            System.out.println(r[0]);
            System.out.println(r[1]);
            System.out.println(r[2]);
            System.out.println(r[3]);
            try {
            	System.out.println(r[4]);
            }
            catch(ArrayIndexOutOfBoundsException d)
            {
            	System.out.println(d);
            }
           System.out.println("Universe");

   		 System.out.println("Serial Number");
   	        System.out.println("Serial Number1");
   	        System.out.println(12/0);
   	        System.out.println("Serial number3");
	}
}
