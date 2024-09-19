package Stringprogram;

import java.util.Scanner;

public class Remove_Particular_String {

	public static void main(String[] args)  // program remove a prticular character string //  Ques 6
	{
         String s1="Welcome";
         char ch='l';
         String s2="";
         for(int i=0;i<s1.length();i++)
         {
         {
        	 if(ch!=s1.charAt(i))
        	 {
        		 s2=s2+s1.charAt(i);        
        		 }
         }
	}
         
         System.out.println(s2);
	}
}
