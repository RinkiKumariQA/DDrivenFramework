package testjava;

import java.io.FileOutputStream;

public class FileHandlingBWrite {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream OS=new FileOutputStream("C:\\Users\\RINKI\\Desktop\\JAVA PRAC.txt",true);
		int a=76;
		OS.write(a);

	}

}
