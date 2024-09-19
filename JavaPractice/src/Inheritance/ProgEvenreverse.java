package Inheritance;

import java.util.Scanner;

public class ProgEvenreverse {

	public static void main(String[] args)  // program  to print first N  even natural number in reverse order //Ques 15
	{
          Scanner sc=new Scanner(System.in);
          System.out.println("Enthe the  value of x=");
          int x=sc.nextInt();
         
          for(int i=x;i>=1;i--)
          {
        	  
         System.out.println(i*2);
          
          }  
          
	}

}
