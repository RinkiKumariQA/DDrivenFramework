package Practice;

public class MethodsString {

	public static void main(String[] args)
	{
       String a="God";
       int b=a.length();
       System.out.println(b);
      
       String c="  Parents";
       String d=c.trim();
       System.out.println(d);
       System.out.println(c);
       
       String e="Hello";
       String f="World";
       int g=43;
       int h=12;
       System.out.println(e+f+g+h);
       
       String i="Laptop";
       String j="20";
       String k=i.concat(j);
       System.out.println(k);
       
       String l="Social Studies";
       CharSequence m=l.subSequence(3,12);
       System.out.println(m);
       
       String n="Sanskriti";
       String o=n.substring(2);
       System.out.println(o);
       
       String p="Life is beautiful";
       String q=p.replace("is", "was");
       String r=p.replace('e', 'n');
       System.out.println(q);
       System.out.println(r);
       
       String s="Her name was xyz,she is good girl.";
       String t=s.replaceFirst("was","is");
       System.out.println(t);
       
       String u="Aradhya";
       int v=u.indexOf('r');
       System.out.println(v);
       
       String w="Bharat";
       int x=w.indexOf("at",2);
       System.out.println(x);
       
       String y="Hello Java";
       int z=y.lastIndexOf("J");
       System.out.println(z);
       
       String s1="Apple";
       boolean s2=s1.contains("pp");
       boolean s3=s1.contains("nn");
       System.out.println(s2);
       System.out.println(s3);
       
       String s4="";
       boolean s5=s4.isEmpty();
       System.out.println(s5);
            
       
	}
}
