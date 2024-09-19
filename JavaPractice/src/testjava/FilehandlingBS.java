package testjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FilehandlingBS {

	public static void main(String[] args) throws Exception 
	{
		FileInputStream IS=new FileInputStream("C:\\Users\\RINKI\\Desktop\\JAVA PRAC.txt");
		int a=IS.read();
		System.out.println((char)a);
		
		FileInputStream ar=new FileInputStream("C:\\Users\\RINKI\\Desktop\\JAVA PRAC.txt");
		int b=ar.read();
		System.out.println(a);
			
		FileInputStream br=new FileInputStream("C:\\Users\\RINKI\\Desktop\\JAVA PRAC.txt");
		int c;
		while((c=br.read())!=-1)
		System.out.println((char)c);
	}

}
