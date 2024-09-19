package Arrayprogram;

import java.util.Arrays;

public class Array_Ascending_order 
{
	public static void main(String[] args) {
		
		 int a[]= {12,9,51,34,8,21,13,10,77,65,85};
		 for(int i=0;i<=a.length;i++)
		 {
			for(int j=i;j<a.length;j++) 
			{
				if(a[i]>a[j])
				{
					int b= a[i];
					a[i]=a[j];
					a[j]=b;
			}
			}
		 } 
		 
		 for(int c:a)
		 {
			 System.out.println(c);
		 }
}
}