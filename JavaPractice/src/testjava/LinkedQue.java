package testjava;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedQue {

	public static void main(String[] args) {
		
		
		 Queue Q1=new LinkedList();
		   Q1.offer(45);
		   Q1.offer("hey");
		   Q1.offer(8.0);
		   Q1.offer(98.0);
		   Q1.offer(true);
		   System.out.println(Q1);//  instead of add we  can use offer
		   
		   Queue Q2=new LinkedList();
		   Q2.offer(45);
		   Q2.offer("hey");
		   Q2.offer(8.0);
		   Q2.offer(98.0);
		   Q2.offer(true);
		   Q2.remove();
		   System.out.println(Q2); // remove first value

		   
		   
		   //ArrayDeque all method will u be use in linkedList Queue 
	}

}
