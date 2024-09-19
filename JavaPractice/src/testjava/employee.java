package testjava;

public class employee {
	
	int emplyid;
	String emplyname;
	int emplysalry;
	int emplydepno;
	String emplyadd;
	
	void display()
	{
		System.out.println(emplyid);  
		System.out.println( emplyname);  
		System.out.println( emplysalry);  
		System.out.println(emplydepno); 
		System.out.println(emplyadd);  
}

	public static void main(String args[])
	{
		employee empl1=new employee ();
		 empl1.emplyid=101;
		 empl1.emplyname="Roy";
		 empl1.emplysalry=45000;
		 empl1.emplydepno=12;
		 empl1.emplyadd="Ranchi";
		 empl1.display();
		 
		 System.out.println(empl1);
		 
		 
		 
		 
		 
				 
	}
}
