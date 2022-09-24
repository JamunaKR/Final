package vExcelDataProvider;

import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Dummy {
public static void main(String[] args) {
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("emp data");
	
	ArrayList<Object[]> emp=new ArrayList<Object[]>();
	emp.add(new Object[] {"id","name","class"});
	emp.add(new Object[] {101,"jon","ten"});
	
	int rownum=0;
	for (Object[] empdat : emp) {
		XSSFRow row=sheet.createRow(rownum++);
		int cellnum=0;
		for (Object value : empdat) {
			XSSFCell cell=row.createCell(cellnum++);
			
		}
		
	}
}
}
