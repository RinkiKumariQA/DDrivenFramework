package Stringprogram;

import java.util.Scanner;

public class Reverse_String {



	public static void main(String[] args)  //reverse string without using predefined method in java  // Q1
	{
	  String s1="Hello Java";
	  String s2="";
	  for(int i=s1.length()-1;i>=0;i--)
	  {
		  s2=s2+s1.charAt(i);
	  }
	  System.out.println(s2);
	  
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Word=");
	  String st=sc.nextLine();
	  String sr="";
	  for(int k=st.length()-1;k>=0;k--)
{
	 sr=sr+st.charAt(k);
}

	  System.out.println(sr);
	  
	  
	  String s3="Java World";
	  StringBuffer ss= new StringBuffer(s3);
	  ss.reverse();
	  System.out.println(ss); // /reverse string  using with predefined method in java // Q2
	
// Scanner sc=new Scanner (System.in);
// System.out.println("enter words =");
// String sa=sc.nextLine();
	//StringBuffer sb=new StringBuffer(sa);
// sb.reverse();
// System.out.println(sb);  // user defined reverse string with predined method // Q3
 
	  
}  
}