package Module_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.collections4.Get;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven{	
	
	
	
	public static void main(String[] args) throws Exception {
		
	    XSSFWorkbook xw;
	    XSSFSheet xs;
	    XSSFRow xr;
	    XSSFCell xc;
	   
		File f1=new File("C:\\Users\\RINKI\\Desktop\\Data.xlsx");
		FileInputStream fn=new FileInputStream(f1);
		xw=new XSSFWorkbook(fn);
		xs=xw.getSheetAt(0);
		int row= xs.getLastRowNum()+1;
		int col=xs.getRow(0).getLastCellNum();
		for(int i=10;i<row;i++)
		{
			for(int j=10;j<col;j++)
			{
				System.out.println(xs.getRow(i).getCell(j).toString());
				System.out.print("\t");
			}
			
			System.out.println("\n");
		}
			
			
		
		
	}
 }
