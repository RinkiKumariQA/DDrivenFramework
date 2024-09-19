package testjava;

public class ExcepFINALLY {

	public static void main(String[] args) 
	{
      System.out.println("JAVA A");
      try
      {
    	  
      System.out.println("JAVA B");
      System.out.println(89/4);
      }
      catch(ArithmeticException a)
      {
    	  System.out.println("getting exception");
      }
      finally
      {
       System.out.println("finally block dispay");
      }
      
      int a=45;
      int b=0;
      System.out.println("Hello Java");
      try
      {
    	  System.out.println(a/b);
      }
      finally
      {
    	  System.out.println("finally block run wothout catch also");
      }
      System.out.println("By");
	}

}
