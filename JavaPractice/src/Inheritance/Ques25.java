package Inheritance;

public class Ques25 {

	public static void main(String[] args) // program to calculate sum of  of the digit of a given number
	
	{
       int sum=0;
       int a=1254;
       while(a!=0)
       {
    	      int b=a%10;
    	      sum=sum+b;
    	      a=a/10;
       }
         System.out.println(sum);   
 
	}

}
