package Basepackages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseClass {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public void ExcelConfig(String excelpath){
		try {
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet1=wb.getSheetAt(0);
	
		} catch (Exception e) {
		
		System.out.println(e.getMessage());
	} 	}
	public String getData(int Sheetnumber, int row, int col)
	{
		sheet1=wb.getSheetAt(Sheetnumber);
		String data=sheet1.getRow(row).getCell(col).getStringCellValue();
		return data;
	}	
	public int getRowCount(int sheetIndex)
	{
		int row = wb.getSheetAt(sheetIndex).getLastRowNum();
		row= row+1;
		return row;
	}	

}


