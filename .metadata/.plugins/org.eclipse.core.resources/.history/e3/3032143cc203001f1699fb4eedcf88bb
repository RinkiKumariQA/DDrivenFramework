package testjava;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sorted_map {

	public static void main(String[] args)
	{
      SortedMap sm=new TreeMap();
      sm.put(1,"Anjali");
      sm.put(2,"Ansu");
      sm.put(3, null);
      sm.put(4,56);
      sm.put(5, 3.8);
      sm.put(6, true);
      System.out.println(sm);
      
      SortedMap s1=new TreeMap();
      s1.putAll(sm);
      System.out.println(s1); // copy constructor
      
        
      SortedMap sm1=new TreeMap();
      sm1.put(1,"Anjali");
      sm1.put(2,"Ansu");
      sm1.put(3, "Aarti");
      sm1.put(4,56);
      sm1.put(6, "Mahima");
      System.out.println(sm1); // Duplicate  key not allowed
      
      
      SortedMap sm2=new TreeMap();
      sm2.put(1,"Anjali");
      sm2.put(2,"Ansu");
      sm2.put(3, "Aarti");
      sm2.put(4,56);
      sm2.put(null, "Mahima");
      System.out.println(sm2); // Duplicate  key not allowed
      
	}

}
