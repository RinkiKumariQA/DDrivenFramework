package testjava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection {

	private static final Vector String = null;

	public static void main(String[] args)
	{
	    LinkedList  a1=new LinkedList();
		a1.add(23);
		a1.add(9.0);
		a1.add("HelloWorld");
		a1.add(null);
		a1.add(true);
		a1.add(23);
		System.out.println(a1);
		
	 
	   	    List a2=new LinkedList();
			a2.add(12);
			a2.add("Wonderful");
			a2.add("HelloWorld");
			a2.add(null);
			a2.add(true);
			a2.add(7.9);
			System.out.println(a2);
			
			ArrayList a3=new ArrayList();
			a3.add("Peace");
			a3.add(89);
			a3.add(8.9);
			a3.add(null);
			a3.add(true);
			a3.add("Peace");
			System.out.println(a3);
			
			Vector <String> a4=new Vector();
			a4.add("Goif");
			a4.add("Wild");
			a4.add("Cat");
			a4.add("Tiger");
			System.out.println(a4);
		
	
			
			
			
  	}

}
