package testjava;

import java.util.LinkedList;

public class LinkedclassC {

	public static void main(String[] args) 
	{
          LinkedList ll=new LinkedList();
          ll.add(89);
          ll.add(3.7);
          ll.add("Ravya");
          ll.add(null);
          ll.add(true);
          ll.add(87);
          ll.addFirst(56);
          
          System.out.println(ll);
          
          LinkedList l1=new LinkedList();
          l1.add(89);
          l1.add(3.7);
          l1.add("Ravaya");
          l1.add(null);
          l1.add(true);
          l1.add(87);
          l1.addLast(23);
          System.out.println(l1);
          
          LinkedList l2=new LinkedList();
          l2.add(89);
          l2.add(3.7);
          l2.add("Ravaya");
          l2.add(null);
          l2.add(true);
          l2.add(87);
          l2.removeFirst();
             System.out.println(l2);
          
             LinkedList l3=new LinkedList();
             l3.add(89);
             l3.add(3.7);
             l3.add("Ravaya");
             l3.add(null);
             l3.add(true);
             l3.add(87);
             l3.removeLast();
             
             System.out.println(l3);
             
             LinkedList l4=new LinkedList();
             l4.add(89);
             l4.add(3.7);
             l4.add("Ravaya");
             l4.add(null);
             l4.add(true);
             l4.add(87);
           System.out.println(l4.getFirst());
                
             LinkedList l5=new LinkedList();
             l5.add(89);
             l5.add(3.7);
             l5.add("Ravaya");
             l5.add(null);
             l5.add(true);
             l5.add(87);
             System.out.println(l5.getLast());
             
             LinkedList l6=new LinkedList();
             l6.add(43);
             l6.add(1.4);
             l6.add("Tanya");
             l6.add(null);
             l6.add(true);
             l6.add("Roy");   
             LinkedList l7=new LinkedList(l6);
             System.out.println(l6);
             System.out.println(l7);
             
	}
	
	

}
