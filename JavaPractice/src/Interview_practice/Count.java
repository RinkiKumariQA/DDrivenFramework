package Interview_practice;

public class Count {

	public static void main(String[] args) 
	{ 
		String stt="Madam";
		String rev="";
		int l=stt.length();
		String org_str=stt;

		for(int i=l-1;i>=0;i--)
		{
			rev=rev+stt.charAt(i);
		}
		  System.out.println(rev);
		if(stt.equals(rev))
		{
			System.out.println("pal");
		}
		
		else
		{
			System.out.println("not pal");
		}
		 
	}

}
