package Practice;

public class ConstructorO 

{
	ConstructorO ()
	{
		System.out.println();
	}
	
	ConstructorO (int a)
	{
		System.out.println(a);
	}
	
	ConstructorO(int a,int b)
	{
		System.out.println(a+b);
	}
	
	ConstructorO(String a,Float b)
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) 
	{
	
		ConstructorO d1=new ConstructorO();
		ConstructorO d2=new ConstructorO(10);
		ConstructorO d3=new ConstructorO(10+90);
		
				
	}

}
