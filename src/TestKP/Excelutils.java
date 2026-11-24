package TestKP;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	public static Object[][] getTestData(String filepath,String SheetName) throws IOException
	
	{
		FileInputStream fis = new FileInputStream(filepath);
	XSSFWorkbook workbook =new XSSFWorkbook(fis);
	XSSFSheet Sheet=workbook.getSheet(SheetName);
	
	int rows = Sheet.getLastRowNum();
	int cols = Sheet.getRow(0).getLastCellNum();
	
	Object[][] data = new Object[rows][cols];
	DataFormatter formatter=new DataFormatter();
	
	for(int i =1; i<=rows;i++) {
		 for(int j=0;j<cols;j++) {
			 data[i-1][j]=formatter.formatCellValue(Sheet.getRow(i).getCell(j));
			 
		 }
		 
	}
	workbook.close();
	fis.close();
	return data;
	}
}
