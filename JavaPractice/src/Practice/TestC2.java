package Practice;

public class TestC2 implements Test2,Test3

{
 public void c1()
 {
	 System.out.println("Apple");
 }
 public void c2()
 {
	 System.out.println("Grapes");
 }
 public void c4()
 {
	 System.out.println("Orange");
 }
 public void c5()
 {
	 System.out.println("Lichi");
 }
	public static void main(String[] args) {
        TestC2 R=new TestC2();
        R.c1();
        R.c2();
        R.c4();
        R.c5();
	}

}

