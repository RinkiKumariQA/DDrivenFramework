package Stringprogram;

public class Remove_WhiteSpace {

	public static void main(String[] args)  // remove all  white spaces from String // Q8
	{
	
	String ss="Java world";
	char ch=' ';
	String s2=" ";
	for(int i=0;i<ss.length();i++)
	{
		if(ch!=ss.charAt(i))
		{
			s2=s2+ss.charAt(i);
		}
		
	}
	System.out.println(s2);
	
	}
}
       