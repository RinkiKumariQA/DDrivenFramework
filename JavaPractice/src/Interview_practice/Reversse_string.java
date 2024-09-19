package Interview_practice;

import java.util.Scanner;

public class Reversse_string {

	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the word st=");
      String st=sc.nextLine();
      String s2="";
      for(int i=st.length()-1;i>=0;i--)
      
      {
    	  s2=s2+st.charAt(i);
      }
      
      System.out.println(s2);
	}

}
