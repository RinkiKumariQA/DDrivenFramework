package Inheritance;

import java.util.Scanner;

public class Ques30_prime_is_or_not {

	public static void main(String[] args)  // program 
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the  number=");
	    int a=ss.nextInt();
	    int i;
	    for(i=2;i<=a;i++)
	   {
		   if(a%i==0) // 7
		   {
			   break;
		   }
	   }
	   if(i==a)
	   {
		   System.out.println("number is prime ");
	   }
	   else
	   {
		   System.out.println("number is not prime");
	   }

	}

}
