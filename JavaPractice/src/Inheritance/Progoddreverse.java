package Inheritance;

import java.util.Scanner;

public class Progoddreverse {

	public static void main(String[] args)  // program  to print first N  odd natural number in reverse order //Ques 16
	{
       Scanner s1=new Scanner(System.in);
       System.out.println("enter the value of y=");
       int y=s1.nextInt();
       for(int i=y;i>=1;i--)
       {
    	   System.out.println(i*2-1);
       }
		
	}

}
