package Inheritance;

import java.util.Scanner;

public class Ques18 {

	public static void main(String[] args)  // program to calculate sum of first  N (user defined) natural number
	{   
		int sum=0;   
		Scanner ss =new Scanner(System.in);
		System.out.println("enter the number a=");
		int a=ss.nextInt();
		int i=1;
		
		while(i<=a)
		{
			sum=sum+i;
			i++;
					}
		System.out.println(sum);
	}

}
