package testjava;

public class Arraypract {

	public static void main(String[] args) 
	{
     
		int [] a= new int [6];
		
	a[0]=12;
	a[1]=45;
	a[2]=12;
	a[3]=65;
	a[4]=15;
	a[5]=65;
	
	for(int j:a)
	{
		System.out.println(j);
	}
			
		
		
	int A []= {10,9,8,7,6,5,4,3,2,1};
	
	for(int i:A)
	{
		System.out.println(i);
	}
	
	
	String c[]= {"world","Java","World"};
	
	
	for(String k:c)
	{
		System.out.println(k);
	}
	
	
	int R[]= {100,200,300,400,500};
	
	int sum=0;
	for(int i:R)
	{
		System.out.println(i);
		sum=sum+i;
	}
	{
		System.out.println(sum);
	}
			
      Object T[]= {12,9.0,"Java","Monkey",'R'};
      
      for(Object s:T)
      {
    	  System.out.println(s);
    	  
    	  
    		 }
	
		Object t[]=new Object[4];
		t[0]=1;
		t[1]=5.0;
		t[2]="Rinki";
		t[3]='A';
		
		 for(Object x:t)
		 {
			 System.out.println(x);
			 
		 }
		
		
	int f[]=new int[3];
	f[0]=1;
	f[1]=2;
	f[2]=5;
	
	for(int i=0;i<f.length;i++)
		
	{
		System.out.println(i);
	}
		 
	
	}
	}

