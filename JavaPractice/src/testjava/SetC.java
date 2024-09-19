package testjava;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetC {

	public static void main(String[] args) 
	{
       HashSet hs=new HashSet();
        hs.add(90);
        hs.add("Collecion");
        hs.add(90);
        hs.add(true);
        hs.add(null);
        hs.add(7.9);
        System.out.println(hs);
        
        HashSet hs1=new HashSet(hs);
        System.out.println(hs1); // pass another collection(copy constructor)
        
        LinkedHashSet LHS=new LinkedHashSet();
        LHS.add(90);
        LHS.add(90);
        LHS.add("Linkedcopy");
        LHS.add(null);
        LHS.add(true);
        LHS.add(9.6);
        System.out.println(LHS);
        
        
        
        
	}
	

}
