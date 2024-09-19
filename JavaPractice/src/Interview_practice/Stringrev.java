package Interview_practice;

import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the value of a=");
         String a=sc.next();
         String s=" ";
         int l=a.length();
         for(int i=l-1;i>=0;i--)
         {
        	 s=s+a.charAt(i);
         }
         System.out.println(s);
         
         String s1="python is programming language";
         String s2=" ";
         int l1=s1.length();
         for(int i2=l1-1;i2>=0;i2--)
         {
        	 s=s+s1.charAt(i2);
         }
         System.out.println(s);
	}
	

}
