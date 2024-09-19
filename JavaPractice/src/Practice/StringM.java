package Practice;

public class StringM {
	
	public static void main(String[] args) {
       
		String s1 = new String ("World");
		String s2 = new String ("Welcome");
		
		System.out.println(s1.equals(s2));
		
		String s3 =new String("ROY");
		String s4 =new String ("roy");
		System.out.println(s3.equalsIgnoreCase(s4));
		
		
		String a="Magnitude";
		String b="magnitude";
		System.out.println(a.compareTo(b));
		
		String a1="hello";
		String b1= "Hello";
		System.out.println(a1.compareTo(b1));
		
		String a2 =new String ("Magnet");
		String b2=new String("magnet");
		System.out.println(a2.compareToIgnoreCase(b2));
		
		 String s6 ="Welcome";
	       System.out.println(s6.charAt(2));
	       
	       String s7="Ayush";
	       char s8= s7.charAt(2);
	       System.out.println(s8);
	       
	       String s9="Nandini";
	       System.out.println(s9.endsWith("i"));
		
	       String s10="Laptop";
	       System.out.println(s10.startsWith("L"));
	       
	       String s11="Anushka";
	       String s12=s11.toUpperCase();
	       System.out.println(s12);
	       
	       String s13="NEHA";
	       System.out.println(s13.toLowerCase());
	       
	    		   
    	}

}
