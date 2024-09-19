package testjava;

import java.util.LinkedHashMap;

public class Linkedhash {

	public static void main(String[] args) {
		
		LinkedHashMap lm =new LinkedHashMap();
		lm.put(101,"Ansh");
		lm.put(102, 56);
		lm.put(103,"Srishti");
		lm.put(104,"Sakashi");
		System.out.println(lm);
		
		LinkedHashMap lm1 =new LinkedHashMap();
		lm1.put(101,"Ansh");
		lm1.put(102, 56);
        lm1.put(null,"Saniya");
		lm1.put(103,"Srishti");
		lm1.put(104,"Sakashi");
        System.out.println(lm1);
        lm1.put(null,78);
        System.out.println(lm1); // null value only once allow
        
        
        LinkedHashMap lm2 =new LinkedHashMap();
		lm2.put(101,"Ansh");
		lm2.put(102, 56);
        lm2.put(103,null);
		lm2.put(104,"Srishti");
		lm2.put(105,"Sakashi");
        lm2.put(106,null);
        System.out.println(lm2); // multiple null values allowe
        
        LinkedHashMap lm3 =new LinkedHashMap();
        lm3.putAll(lm2);
        System.out.println(lm3); // copy constructor putAll
		

	}

}
