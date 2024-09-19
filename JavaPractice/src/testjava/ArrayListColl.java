package testjava;

import java.util.ArrayList;

public class ArrayListColl {

	public static void main(String[] args) 
	{
	ArrayList ar=new ArrayList();
	ar.add(65);
	ar.add("String");
	ar.add(0.9);
	ar.add("Divya");
	ar.add(65);
	ar.add(null);
	ar.add(true);
	ar.remove(null);
	System.out.println(ar);
	
	ArrayList a1=new ArrayList();
	a1.add(65);
	a1.add("String");
	a1.add(0.9);
	a1.add("Divya");
	a1.add(65);
	a1.add(null);
	a1.add(true);
	for (Object a2:a1)
	System.out.println(a2);
	

	ArrayList<String> a3=new ArrayList();
	a3.add("World");
	a3.add("String");
	a3.add("Hello");
	a3.add("Divya");
	a3.add("Alpha");
	a3.add("Bita");
	for (String a4:a3)
	System.out.println(a4);

	
	ArrayList a5=new ArrayList();
	 a5.add(65);
	a5.add("String");
	a5.add("0.9");
	a5.add("Divya");
	a5.add("Alpha");
	a5.add(null);
	a5.add(true);
	a5.addAll(ar);
	System.out.println(a5);
	
	ArrayList a6=new ArrayList();
	 a6.add(65);
	a6.add("String");
	a6.add("0.9");
	a6.add("Divya");
	a6.add("Alpha");
	a6.add(null);
	a6.add(true);
	System.out.println(a5.contains("toy"));
	
	ArrayList a7=new ArrayList();
	 a7.add(65);
	a7.add("String");
	a7.add("9.7");
	a7.add("Paython");
	a7.add("America");
	a7.add(null);
	a7.add(true);
	a6.retainAll(a7);
   	System.out.println(a6);
   	
   	ArrayList b1=new ArrayList(ar);
   	System.out.println(ar);
   	System.out.println(b1);
	
	}

}
