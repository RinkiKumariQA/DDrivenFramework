package Inheritance;
class A
{
	int a;
	int b;
	public void display()
	{
		System.out.println(a+b);
	}
}
class B extends A
{
	
	int x;
	int y;
	public void show() 
	{
		 System.out.println(x+y);		 
	}	
} 
class C extends B
  {
	  int p;
	  int q;
	   public void addiation() 
	   {
		  System.out.println(p+q);	   
	   }
  }
  
public class Test1 
{

	public static void main(String[] args) 
	{
	 A a1=new A();
	 a1.a=10;
	 a1.b=80;
	 a1.display();
	 
	 B bi=new B();
	 bi.x=70;
	 bi.y=10;
	 bi.show();
	 
	 
	 bi.a=100;
	 bi.b=200;
	 bi.display();
	 
	 C ci=new C();
	 ci.a=20;
	 ci.b=30;
	 ci.x=40;
	 ci.y=50;
	 ci.p=60;
	 ci.q=80;
	 ci.addiation();	 
	}

}
