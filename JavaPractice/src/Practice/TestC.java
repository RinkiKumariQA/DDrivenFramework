package Practice;

public class TestC implements Test2.T2
{
  public void a5()
  {
	  System.out.println("Social Science");
  }
  public void a6()
  {
	  System.out.println("Sanskrit");
  }
  public  void a7()
  {
	  System.out.println("General Knowledge");
  }
  public void a8()
  {
	  System.out.println("Moral Science");
  }
	public static void main(String[] args) 
	{
		Prac1.T1 d=new PracC();
	
		Test2.T2 d1=new TestC();
		d.a1();
		d.a2();
		d.a3();
		d.a4();
		d1.a5();
		d1.a6();
		d1.a7();
		d1.a8();
		
	}

}
