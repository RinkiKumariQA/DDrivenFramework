package testjava;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigable {

	public static void main(String[] args) 
	{
        NavigableSet SS=new TreeSet();
       SS.add("Nitesh");
       SS.add("Mohan");
       SS.add("Prerna");
       SS.add("Ruchi");
       SS.add("Anushka");
       System.out.println(SS); // homogeneous 
        
       NavigableSet S1=new TreeSet();
       S1.add("Nitesh");
      S1.add("Mohan");
      S1.add("Prerna");
      S1.add("Ruchka");
      S1.add("Anushka");
       System.out.println(S1.ceiling("Nitesh")); // Ceiling  // equal value display
       
       NavigableSet S2=new TreeSet();
       S2.add("Nitesh");
      S2.add("Mohan");
      S2.add("Prerna");
      S2.add("Ruchka");
      S2.add("Anushka");
       System.out.println(S2.higher("Anushka")); // higher // just higher  value display
       
       NavigableSet S3=new TreeSet();
       S3.add("Nitesh");
      S3.add("Mohan");
      S3.add("Prerna");
      S3.add("Ruchka");
      S3.add("Anushka");
       System.out.println(S3.lower("Prerna")); // lower // just lower  value display
       
       NavigableSet S4=new TreeSet();
      S4.add("Nitesh");
      S4.add("Mohan");
      S4.add("Prerna");
      S4.add("Ruchka");
      S4.add("Anushka");
       System.out.println(S4.floor("Prerna")); // floor // just lower  value display
      
	}

}
