package Stringprogram;

public class String_Char {

	public static void main(String[] args) 
	{
		String s1="Character";
		char c[]=new char[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			c[i]=s1.charAt(i);
		}
         for(int j=0;j<c.length;j++)
         {  
        	 System.out.println(c[j]);  // Convert String to Character aaray without predefined // Q4
         }
         
         String sa=" String";
         char c1[]=sa.toCharArray();
         for(int i=0;i<sa.length();i++)
         {
        	 System.out.println(c1[i]);  //  // Convert String to Character aaray with predefined // Q5
         }
	}

}
