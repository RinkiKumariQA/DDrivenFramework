package testjava;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filehandling_CharStream {

	public static void main(String[] args) throws Exception 
	{
        FileReader FR=new FileReader("C:\\Users\\RINKI\\Desktop\\JAVA PRAC.txt");
        int a=FR.read();
        System.err.println(a);
        
        FileReader FR1=new FileReader("C:\\Users\\RINKI\\Desktop\\JAVA PRAC.txt");
        int a1;
        while((a1=FR1.read())!=-1)
        System.out.println(a1);  
        
        FileReader FR2=new FileReader("C:\\Users\\RINKI\\Desktop\\JAVA PRAC.txt");
        int a2;
        while((a2=FR2.read())!=-1)
        System.out.print((char)a2); 
	}

}
