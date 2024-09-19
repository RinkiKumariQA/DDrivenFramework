package Practice;

public class Stringprc {

	public static void main(String[] args)
	{
        String s ="Hello";//
        System.out.println(s);
        
		String s1=new String("Java");//
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("World");//
		System.out.println(s2);
		
		StringBuilder s3=new StringBuilder("Rinki");//
		System.out.println(s3);
		
		String s4=new String("Practice");
		s4.concat("Make");
		System.out.println(s4);
			
		StringBuffer s5=new StringBuffer("Java");
		s5.append("by");
		System.out.println(s5);
		
		StringBuilder s6= new StringBuilder("Python");
		StringBuilder s7 =(s6);
		System.out.println(s6);
		System.out.println(s7);
		
		String s8="Samikasha";
		String s9=(s8);
		System.out.println(s8);
		System.out.println(s9);
		
		char s10 ='R';
		char s11=(s10);
	   System.out.println(s10);
	   System.out.println(s11);
		
	   String a=new String("JAVA WORLD");
	   String b=new String("Paython Class");
	   String c=new String("JAVA WORLD");
	   System.out.println(a==b);
	   System.out.println(a==c);
	   System.out.println(b==c);
	   
	   String d="Laptop";
	   String e="Dell";
	   String f="Laptop";
	   System.out.println(d==e);
	   System.out.println(e==f);
	   System.out.println(d==f);
	   
		
		
	}

}
