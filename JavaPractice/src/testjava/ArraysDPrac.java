package testjava;

public class ArraysDPrac {

	public static void main(String[] args)
	{

       int a [][]=new int [5][2];
       a[0][0]=12;
       a[0][1]=13;
       a[1][0]=14;
       a[1][1]=15;
       a[2][0]=16;
       a[2][1]=17;
       a[3][0]=18;
       a[3][1]=19;
       a[4][0]=20;
       a[4][1]=21;
       
       for(int i[]:a)
       {
    	   for (int j:i)
    		   
    		   System.out.println(j+"");
       }
       System.out.println();

        
        int b[][]= {{15,20,25},{30,35,40},{45,50,55},{60,65,70},{75,80,90}};
        for(int c[]:b)
        {
        	for(int d:c)
        		
        	{System.out.println(d+"");
        	
        	System.out.println();
        	}
        }
        
	}

}
