package testjava;

import java.util.Vector;

public class VectorColl {

	public static void main(String[] args) 
	{
           Vector V1=new Vector();
           V1.addElement(56);
           V1.addElement("Hello");
           V1.addElement(8.9);
           V1.addElement(56);
           V1.addElement(null);
           V1.addElement(true);
           System.out.println(V1);
           
           Vector V2=new Vector();
           V2.addElement(56);
           V2.addElement("Hello");
           V2.addElement(8.9);
           V2.addElement(56);
           V2.addElement(null);
           V2.addElement(true);
           V2.addFirst(40);
           System.out.println(V2); 

    Vector V3=new Vector();
    V3.addElement(56);
    V3.addElement("Hello");
    V3.addElement(8.9);
    V3.addElement(56);
    V3.addElement(null);
    V3.addElement(true);
    V3.removeElementAt(3);
    System.out.println(V3);
           

Vector V4=new Vector();
   V4.addElement(56);
    V4.addElement("Hello");
    V4.addElement(8.9);
    V4.addElement(56);
    V4.addElement(null);
    V4.addElement(true);
    System.out.println(V4.firstElement());
 
    Vector V5=new Vector();
    V5.addElement(56);
    V5.addElement("Hello");
    V5.addElement(8.9);
    V5.addElement(56);
    V5.addElement(null);
    V5.addElement(true);
    
    System.out.println(V5.lastElement());
    
    Vector V6=new Vector();
    V6.addElement(56);
    V6.addElement("Hello");
    V6.addElement(8.9);
    V6.addElement(56);
    V6.addElement(null);
    V6.addElement(true);
    V6.removeElement("Hello");
     System.out.println(V6);

     
     Vector V7=new Vector();
     V7.addElement(56);
     V7.addElement("Hello");
     V7.addElement(8.9);
     V7.addElement(56);
     V7.addElement(null);
     V7.addElement(true);
   V7.removeElementAt(4) ;
     System.out.println(V7);

     Vector V8=new Vector();
     V8.addElement(56);
     V8.addElement("Hello");
     V8.addElement(8.9);
     V8.addElement(56);
     V8.addElement(null);
     V8.addElement(true);
     V8.removeAllElements() ;
     System.out.println(V8);
    
     Vector V9=new Vector();
     V9.addElement(56);
     V9.addElement("Hello");
     V9.addElement(8.9);
     V9.addElement(56);
     V9.addElement(null);
     System.out.println(V9);
     Vector V10=new Vector(V9);
     System.out.println(V10);
    
	
	}

}
