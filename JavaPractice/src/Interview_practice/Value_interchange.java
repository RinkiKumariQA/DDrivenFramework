package Interview_practice;

import java.util.Scanner;

public class Value_interchange {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of a=");
	int a=sc.nextInt();
	System.out.println("enter the value of b=");
	int b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	 

	
	}

}
