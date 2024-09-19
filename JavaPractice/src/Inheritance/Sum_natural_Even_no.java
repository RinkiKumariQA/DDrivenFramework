package Inheritance;

import java.util.Scanner;

public class Sum_natural_Even_no {

	public static void main(String[] args) // // program to caculate sum of first of first N odd natural numbers // Q21
	{
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enthe the  value of x=");
         int x=sc.nextInt();
         int sum=0;
         for(int i=1;i<=x;i++)
         {
        	 sum=sum+(2*i);
         }
           System.out.println(sum);
	}

}
