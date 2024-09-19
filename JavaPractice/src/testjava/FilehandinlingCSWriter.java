package testjava;

import java.io.FileWriter;

public class FilehandinlingCSWriter {

	public static void main(String[] args) throws Exception {

		FileWriter FW= new FileWriter("C:\\Users\\RINKI\\Desktop\\JAVA PRAC.txt",true);
		FW.write( "Life is beautiful");
		FW.close();
	}

}
