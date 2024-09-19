package Practice;

public class  Interfaceclass implements PracInterface

{
   public void m1() 
   {
	   System.out.println("Arjun");
  
   }
   
  public  void m2()
   {
	   System.out.println("Sangam");
   }
  
  public void m3()
	{
		System.out.println("Hello");
	}
	
	public void m4()
	{
		System.out.println("Hey");
	}

	public static void main(String[] args)
	{
		Interfaceclass i1=new Interfaceclass();
		i1.m1();
		i1.m2();
		i1.m3();
		i1.m4();
	}
}
	
