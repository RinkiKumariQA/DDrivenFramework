package Practice;

import java.util.Scanner;

public class Ifeven {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of a");
		int a= sc.nextInt();
		
  if(a%2==0)
  {
	  System.out.println("no.is even");
	  
  }
  
  else
  {
	  System.out.println("no.is odd");
	  
  }
	}

}
