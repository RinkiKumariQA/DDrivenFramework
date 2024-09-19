package Inheritance;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args)  //  program to calculate factorial of a number // Ques 20
	{    int fact=1;
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enthe the  value of n=");
         int n=sc.nextInt();
         
         for(int i=1;i<=n;i++)
        	 
         {
        	 fact=fact*i;
        	
         }
         System.out.println(fact);
         
         Scanner ss=new Scanner(System.in);
         System.out.println("Enthe the  value of a=");
         int a=ss.nextInt();
         int f=1;
          while(a>=1)
          {
        	  f=a*f;
        	 a--;
          }
         System.out.println(f);
	}

}
