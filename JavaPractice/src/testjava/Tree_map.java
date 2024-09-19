package testjava;

import java.util.TreeMap;

public class Tree_map {

	public static void main(String[] args)
	{
       TreeMap tm=new TreeMap();
       tm.put(1, "Anika");
       tm.put(2,"Ashu");
       tm.put(3,"Kajal");
       tm.put(4, "Shalini");
       System.out.println(tm);
       
       TreeMap tm1=new TreeMap();
       tm1.put(1, "Anika");
       tm1.put(2,"Ashu");
       tm1.put(3,null);
       tm1.put(4, "Shalini");
       tm1.put(5,null);
       System.out.println(tm1); // multiple null allow
       
       TreeMap tm2=new TreeMap();
       tm2.put(1, "Anika");
       tm2.put(2,"Ashu");
       tm2.put(3,"Kajal");
       tm2.put(null,"Shalini");
       System.out.println(tm2); // null not allow

	}

}
