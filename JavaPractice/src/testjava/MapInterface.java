package testjava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args)
	{
		 Map m1=new HashMap();
        m1.put(1, "Rani");
        m1.put(2,"Puja");
        m1.put(3,"Mani");
        m1.put(4,"Puja");
        m1.put(5, 78);
        System.out.println(m1);
     
    
        Map m2=new Hashtable();
        m2.put(1, "Amit");
        m2.put(2,"Ankit");
        m2.put(3,"Rahul");
        m2.put(4,"Sanu");
        m2.put(5, "Sanu");
        System.out.println(m2);
        
        
        Map m3=new LinkedHashMap();
        m3.put(1,"Arisha");
        m3.put(2, "Sania");
        m3.put(3,"Arisha");
        m3.put(4, "Naziya");
        m3.put(5, 6);
        System.out.println(m3);
        
	}

}
