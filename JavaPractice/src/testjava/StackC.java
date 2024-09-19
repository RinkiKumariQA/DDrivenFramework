package testjava;

import java.util.Stack;

public class StackC {

	public static void main(String[] args) 
	{
     Stack s1=new Stack();
      s1.push(78);
      s1.push("Hello");
      s1.push(9.0);
      s1.push(78);
      s1.push(null);
      s1.push(true);
      System.out.println(s1);  //push
       
      Stack s2=new Stack();
      s2.push(78);
      s2.push("Hello");
      s2.push(9.0);
      s2.push(78);
      s2.push(null);
      s2.push(true);
      System.out.println(s2.peek()); //peak
      
      Stack s3=new Stack();
      s3.push(78);
      s3.push("Hello");
      s3.push(9.0);
      s3.push(78);
      s3.push(null);
      s3.push(true);
      s3.pop();
      System.out.println(s3);  //pop
      
      Stack s4=new Stack();
      s4.push(78);
      s4.push("Hello");
      s4.push(9.0);
      s4.push(78);
      s4.push(null);
      s4.push(true); 
      System.out.println(s4.empty()); //empty
      
      Stack s5=new Stack();
      s5.push(78);
      s5.push("Hello");
      s5.push(9.0);
      s5.push(78);
      s5.push(null);
      s5.push(true);
      System.out.println(s5.search(78)); // search
      
      Stack s6=new Stack();
      s6.push(78);
      s6.push("Hello");
      s6.push(9.0);
      s6.push(78);
      s6.push(true);
      System.out.println(s6);
      
      Stack s7=new Stack();
    
      
	}

}
