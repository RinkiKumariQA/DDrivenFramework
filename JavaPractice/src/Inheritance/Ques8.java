package Inheritance;

import java.util.Scanner;

public class Ques8 {

	public static void main(String[] args) // a program to print first 10 natural nuber in reverse order
	{
		 for(int i=10;i>=1;i--)
		    {
		    	System.out.println(i);
		    }
		
	    Scanner ss=new Scanner(System.in); // / a program to print first N natural nuber in reverse order by user input// ques 10
	    System.out.println("Enter the value of a=");
	    int a=ss.nextInt();
	    for(int i=a;i>=1;i--)
	    {
	    	System.out.println(i);
	    }
	    
	   
	}

}
