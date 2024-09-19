package testjava;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted {

	public static void main(String[] args) 
	{
             SortedSet SS=new TreeSet();
             SS.add("Hello");
            SS.add("Wonderful");
            SS.add("Mice");
            SS.add("Wonderfull");
            SS.add("Apple");
            System.out.println(SS); // homogeneous 
             
            SortedSet S1=new TreeSet();
            S1.add("Hello");
           S1.add("Wonderful");
           S1.add("Mice");
           S1.add("Wonderfull");
           S1.add("Apple");
            System.out.println(S1.getFirst()); // get first
            
           SortedSet S2=new TreeSet();
            S2.add("Hello");
           S2.add("Wonderful");
           S2.add("Mice");
           S2.add("Zebra");
           S2.add("Apple");
           System.out.println(S2.getLast()); // get last
           
            SortedSet S3=new TreeSet();
             S3.add("Hello");
             S3.add("Wonderful");
             S3.add("Mice");
             S3.add("Wonderfull");
             S3.add("Apple");
             System.out.println(S3.headSet("Mice")); // lesser character display //headSet method
             
             SortedSet S4=new TreeSet();
             S4.add("Hello");
             S4.add("Wonderful");
             S4.add("Mice");
             S4.add("Wonderfull");
             S4.add("Apple");
             S4.add("Queen");
             System.out.println(S4.tailSet("Mice")); // higher character display including Mice // tailSet method
             
           
           
           

}
}
