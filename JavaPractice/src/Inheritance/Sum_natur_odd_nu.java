package Inheritance;

import java.util.Scanner;

public class Sum_natur_odd_nu {

	public static void main(String[] args)  // program to caculate sum of first of first N odd natural numbers // Q22
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enthe the  value of y=");
        int y=sc.nextInt();
        int sum=0;
        for(int i=1;i<=y;i++)
        {
        	sum=sum+(i*2-1);
        }
        System.out.println(sum);
	}

}
