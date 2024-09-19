package Inheritance;

import java.util.Scanner;

public class Ques7 {

	public static void main(String[] args) // write a program to print first 10 natural numbers
	{
	 
      for(int i=1;i<=10;i++)
      {
    	  System.out.println(i);
      }
      
      Scanner ss=new Scanner(System.in);   // user defined natral number \\ ques 9
      System.out.println("enter the number a=");
      int a=ss.nextInt();
      for(int i=1;i<=a;i++)
      {
    	  System.out.println(i);
      }
	}

}
 