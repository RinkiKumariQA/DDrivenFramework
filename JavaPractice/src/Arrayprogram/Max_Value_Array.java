package Arrayprogram;

public class Max_Value_Array {

	public static void main(String[] args) // find maximum value in array in java
	{
		 int a[]= {12,76,45,54,98,34};
		 int max=a[0];
		 for(int i=1;i<a.length;i++)
		 {
			 if(max<a[i])
			 {
				 max=a[i];
			 }
		 }
		 System.out.println(max);
	}

}
