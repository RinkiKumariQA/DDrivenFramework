package Practice;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args)
	{
		int a, b, add,sub,mul,div,mod;
		Scanner s1 =new Scanner(System.in);
		System.out.println("enter the two number=");
		a=s1.nextInt();
		b=s1.nextInt();
		add=a+b;
		sub=a-b;
		mul=a*b;
		div= a/b;
		mod=a%b;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);

		
		
		System.out.println(2>5 || 4<5);
		
		
		

	}

}
