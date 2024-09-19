package Inheritance;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args)
	{   
	
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int y=s1.nextInt(); // 1234
		int rev=0,rema;
		
		
		  while(y>0)  
		  {
		  rema=y%10;           // 123%10=3
		   rev=rev*10+rema; // 0*10+3=3
		   y=y/10;// 3/10
		    }
		  System.out.println(rev);
		  
		  
		  int a= 987;  // 2nd method of reverse integer
		  int s=0;
		  while(a!=0)
		  {
			  int b=a%10;
			  s=s*10+b;
			  a=a/10;
			  
		  }
		   System.out.println(s);
      
	}

}
