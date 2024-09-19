package Practice;


public class PolymorphsimPra
{
        void m1()
        {
        	System.out.println("Practice");
        }
         
        void m1(int a)
        {
        	System.out.println(a);
        }
	 void m1(int a, int b)
	 {
		 System.out.println(a+b);
	 }
	 
	 void m1(String a, double b)
	
	 {
		 System.out.println(a+b);
	 }

	public static void main(String[] args) 
	{
		
		PolymorphsimPra p1=new PolymorphsimPra();
		p1.m1();
		p1.m1(90);
		p1.m1(10,12);
		p1.m1("world",1.0);
		
			
   
	
	}

}
