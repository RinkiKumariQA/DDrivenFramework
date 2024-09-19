package Inheritance;

import java.util.Scanner;

public class Prod_naut_num {

	public static void main(String[] args) { // program to calculate product of fist n natural number // Ques 19
            
		int s=1;
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enthe the  value of x=");
         int x=sc.nextInt();
         int i=1;
         while(i<=x)
         {
        	 s=s*i;
        	 i++;
         }
         
         {
        	 System.out.println(s);
         }
         
         
	}

	}


