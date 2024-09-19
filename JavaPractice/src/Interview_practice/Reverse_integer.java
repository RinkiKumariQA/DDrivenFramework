package Interview_practice;

import java.util.Scanner;

public class Reverse_integer {

	public static void main(String[] args)
	{
     int a=12346;
     int b=0;
     while(a!=0)
     {
    	 int r=a%10;
    	 b=b*10+r;
    	 a=a/10;
    	  
    }
     System.out.println(b);
     
     
     
    int c=1234598;
    int count=0;
    while(c!=0)
    {
    	c=c/10;
    	count++;
    }
     System.out.println(count);
	
    
}   
}
