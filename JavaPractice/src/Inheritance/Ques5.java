package Inheritance;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args)  //  write a program to find greater between two number
	{ 
        Scanner ss=new Scanner (System.in);
		System.out.println("enter the value of a=");
		int a=ss.nextInt();
		System.out.println("enter the value of b=");
		int b=ss.nextInt();
		System.out.println("enter the value of c=");
		int c=ss.nextInt();
		
		if(a>b)
		
		
		if(a<c)
		{
			System.out.println("a is greater");
		}
			
		else
		{
		  System.out.println("c is greater");
		}
		else
		{
			if(b>c)
			{
				System.out.println("c is greater");
			}
			
				else
				{
					System.out.println("b is greater");
				}
			}
		}
	}


