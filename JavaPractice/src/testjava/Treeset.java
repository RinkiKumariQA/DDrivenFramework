package testjava;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) 
	{
            TreeSet TS =new TreeSet();
            TS.add("Hello");
            TS.add("Wonderful");
            TS.add("Mice");
            TS.add("Wonderfull");
            TS.add("Apple");
            System.out.println(TS); // homogeneous
            
            TreeSet T1=new TreeSet(TS);
            System.out.println(T1);  // pass another collection(copy constructor)
	}
	
	

}
