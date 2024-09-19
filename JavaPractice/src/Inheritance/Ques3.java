package Inheritance;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args)  // write a program to check whether a given number is even or odd
	{

		Scanner ss=new Scanner(System.in);
		System.out.println("enter the value of a=");
		int a=ss.nextInt();
		
		
		if(a%2==0)
			
			
			System.out.println("no. is even");
		
		else
		
		{
			System.out.println("no is  odd");
		}
	}

}
