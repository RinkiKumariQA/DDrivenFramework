package testjava;

public class ArraysDS {

	public static void main(String[] args) 
	{

		int[][]a=new int[4][4];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[0][3]=40;
		a[1][0]=50;
		a[1][1]=60;
		a[1][2]=70;
		a[1][3]=80;
		a[2][0]=90;
		a[2][1]=100;
		a[2][2]=110;
		a[2][3]=120;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[0][3]);
		System.out.println(a[1][0]);
	    System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[1][3]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		System.out.println(a[2][2]);
		System.out.println(a[2][3]);

	int [][]b ={{11,12,12},{13,14,15},{16,17,18}};
		for(int k=0;k<b.length;k++)
		
		{
		for(int j=0;j<b.length;j++)

		{
			System.out.println(b[k][j]);
		}
}
		
		String s= "Rinki";
		
		System.out.println(s.length());
		
		String s1="Welcome to the ";
		String s2="Java World.";
		
		System.out.println(s1+s2);//
		
		System.out.println("welcome to the"+ "Java World");//
		
		System.out.println(s1.concat(s2));
		
		String s3="Rinki";
		String s4="rinki";
		
		System.out.println(s3.equals(s4));
		
		
		
	}
}
