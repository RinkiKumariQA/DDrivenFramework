package Stringprogram;

public class Find_Duplicate_String {

	public static void main(String[] args) // find duplicate character from String // Ques 7
	{
		String as="JAVA CLASS";
	
		for(int i=0;i<as.length();i++)
		{
			for(int j=i+1;j<as.length();j++)
			{
				if(as.charAt(i)==as.charAt(j))
				{
					System.out.println(as.charAt(i));
				}
			}
			
			
		}

	}

}
