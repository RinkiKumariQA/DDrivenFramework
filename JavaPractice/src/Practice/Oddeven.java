package Practice;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter te value of a=");
	    int a=sc.nextInt();
	    
	    if(a%2==0)
	    {
	    	System.out.println( "no is even");
	    	
	    }
	   
	    
	    if(a%2==1)
	    {
	    	System.out.println("no is odd");
	    }
	    
	}

}
