package testjava;

import java.util.Hashtable;

public class HasTable {

	public static void main(String[] args) {

    Hashtable hta=new Hashtable();
    hta.put(101, "Priya");
    hta.put(102,89);
    hta.put(103,"Megha");
    hta.put(104,"Riya");
    hta.put(105,"Priya");
    System.out.println(hta);
    
	
	     Hashtable ht=new Hashtable();
	     ht.put(101, "Priya");
	     ht.put(102,"Lalit");
	     ht.put(103,"Lalit");
	     System.out.println(ht); // Duplicate value not allowed
	     
	     
	    Hashtable h=new Hashtable();
	    h.putAll(hta);
	    System.out.println(h);
	    
	    Hashtable ht1=new Hashtable();
	     ht1.put(101, "Priya");
	     ht1.put(102,"Lalit");
	     ht1.put(103,"Megha");
	     ht1.put(null, "Riya");
	     System.out.println(ht1); // null value not alllowed
	     
	}

	
}
