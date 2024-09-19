package Practice;

public interface InterfaceM {
	
 private void c1()
 {
	System.out.println("is"); 
 }
 
 
 default void a2()
 {
	 System.out.println("Life");
	 c1();
 }	 

 
 static void a3()
 {
	 System.out.println("wonderful");
 }
}
