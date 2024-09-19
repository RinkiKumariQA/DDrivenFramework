package testjava;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws Exception
	{
		File f1=new File("C:\\Users\\RINKI\\Desktop\\JAVA PRAC.txt");
		f1.createNewFile();
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
        System.out.println(f1.getName());
        System.out.println(f1.length());
        System.out.println(f1.exists());
	}

}
