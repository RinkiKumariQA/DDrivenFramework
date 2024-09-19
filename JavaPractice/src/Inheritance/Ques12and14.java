package Inheritance;

import java.util.Scanner;

public class Ques12and14 {

	public static void main(String[] args) // program to print first 10 odd natiral numbers \\ques 12
	{
		for( int i=1;i<=10;i++)
		{
			System.out.println(i*2-1);
		}
		
		Scanner ss=new Scanner(System.in); // program to print first N(user defined) odd natiral numbers \\ques 14 // 
		System.out.println("enter the value of a=");
		int a=ss.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.println(i*2-1);
		}
	}

}
