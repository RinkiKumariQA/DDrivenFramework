package Arrayprogram;

public class Min_Value_Array {

	public static void main(String[] args) //  find minimum value in array in java // Ques 2
	{
       int b[]= {12,97,67,60,10,84};
       int min=b[0];
       for(int i=1;i<b.length;i++)
       {
    	   if(min>b[i])
    	   {
    		   min=b[i];
    	   }
       }
       System.out.println(min);
	}

}
