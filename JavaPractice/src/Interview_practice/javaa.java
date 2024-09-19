package Interview_practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class javaa
{ 
   public static void main(String[] args)
   {

	  int a[]= {2,24,5,25,37,84,73};
	  for(int i=0;i<a.length;i++)
	  {
		  for(int j=i+1;j<a.length;j++)
		  {
			  if(a[i]>a[j])
			  {
				  int temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;String s="Welcome";
					String ss="";
					String s1[]=s.split(s);
					for(String a1:s1)
					{
						StringBuilder sb=new StringBuilder(a1);
						sb.reverse();
						ss=ss+sb.toString()+" ";	
					}
					
					System.out.println(ss);
			  }
		  }
	  }
	  
	  for(int k=0;k<a.length;k++) {
	  System.out.println(a[k]);
	  }
}
}	
