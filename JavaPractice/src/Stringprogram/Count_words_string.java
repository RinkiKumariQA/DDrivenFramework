package Stringprogram;

import java.util.Scanner;

public class Count_words_string {

	public static void main(String[] args)  // write a program count number of word in a string 
	{
	   Scanner ss=new Scanner(System.in);
	   System.out.println("enter the words=");
		String a1=ss.nextLine();
		int count=1;
		for(int i=0;i<a1.length();i++)
		{
			if( (a1.charAt(i)==' ') && (a1.charAt(i+1)!=' '))  
		
		{
			count++;
		}
		
		}
		System.out.println(count);
		
		
		String sa="lif is beautiful";           // this method is not given by sir
		int Count=1;
		
		for(int i=0;i<sa.length();i++)
		{
			if(sa.charAt(i)==' ')//'=='
			{
				count++;
			}
		}
		System.out.println(count);
		
		 
         }
		
	

}
