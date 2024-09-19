package testjava;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) 
	
	{
  Scanner sc=new Scanner(System.in);
  System.out.println("Additation enter 1");
  System.out.println("Substraction enter 2");
  System.out.println("Multiplication enter 3");
  System.out.println("Division enter 4");
  System.out.println("select the option number=");
  int ch=sc.nextInt();
  switch(ch)
  {
	  
  case 1:
	  System.out.println("value of a");
	  int a=sc.nextInt();
	  System.out.println("value of B");
	  int b=sc.nextInt();
	  int c= a+b;
	  System.out.println("Additation is="+c);
	  break;
	  
  case 2:
	  System.out.println("value of d");
	  int d=sc.nextInt();
	  System.out.println("value of e");
	  int e=sc.nextInt();
	  int f= d-e;
	  System.out.println("Substraction is="+f);
	  break;
	  
  case 3:
	  System.out.println("value of h");
	  int h=sc.nextInt();
	  System.out.println("value of i");
	  int i=sc.nextInt();
	  int j= h*i;
	  System.out.println("Multiplication is="+j);
	  break;
	  
  case 4:
	  System.out.println("value of q");
	  int q=sc.nextInt();
	  System.out.println("value of r");
	  int r=sc.nextInt();
	  int s= q/r;
	  System.out.println("Division is="+s);
	  break;
	  
	  default:
		  System.out.println("invalid option");
	  
	  
  
  }


  
  
	}

}
