package testjava;

import java.util.ArrayDeque;
import java.util.Queue;

public class Aqueue {

	public static void main(String[] args)
	{
		Queue Q =new ArrayDeque();
		Q.add(45);
		Q.add("Hello");
		Q.add(8.0);
		Q.add(45);
		Q.add(true);
		System.out.println(Q);
         
		
	   Queue Q1=new ArrayDeque();
	   Q1.offer(45);
	   Q1.offer("hey");
	   Q1.offer(8.0);
	   Q1.offer(98.0);
	   Q1.offer(true);
	   System.out.println(Q1);//  instead of add we  can use offer
	   
	   Queue Q2=new ArrayDeque();
	   Q2.offer(45);
	   Q2.offer("hey");
	   Q2.offer(8.0);
	   Q2.offer(98.0);
	   Q2.offer(true);
	   Q2.remove();
	   System.out.println(Q2); // remove first value
	   
	   Queue Q3=new ArrayDeque();
	   Q3.offer(45);
	   Q3.offer("hey");
	   Q3.offer(8.0);
	   Q3.offer(98.0);
	   Q3.offer(true);
	   Q3.poll();
	   System.out.println(Q3);// remove first value
	   
	   Queue Q4=new ArrayDeque();
	   Q4.poll();
	   System.out.println(Q4);//remove first value difference of poll & remove)
	   
	   Queue Q5=new ArrayDeque();
	   Q5.offer(45);
	   Q5.offer("hey");
	   Q5.offer(8.0);
	   Q5.offer(98.0);
	   Q5.offer(true);
	   System.out.println(Q5.element()); // display first value
	   

	   Queue Q6=new ArrayDeque();
	   Q6.offer(45);
	   Q6.offer("hey");
	   Q6.offer(8.0);
	   Q6.offer(98.0);
	   Q6.offer(true);
	   System.out.println(Q6.peek());// display first value
	   
	   Queue Q7=new ArrayDeque();
	   System.out.println(Q7.peek());  // display first value
	   
	   Queue Q8=new ArrayDeque();
	   System.out.println(Q8.element()); // exception occur
	   
	    
	}

}
