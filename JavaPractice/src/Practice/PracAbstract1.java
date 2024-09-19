package Practice;

public class PracAbstract1 extends PracAbstract
{
  void m1()
  {
	  System.out.println("MACHINE");
  }
  void m2()
  {
	  System.out.println("LAPTOP");
  }
  
  void m3()
  {
	  System.out.println("Artifical Intelligence");
  }	
	
	public static void main(String[] args) {

		PracAbstract p=new PracAbstract1();
		p.m1();
		p.m2();
		p.m3();
		
	}

}
