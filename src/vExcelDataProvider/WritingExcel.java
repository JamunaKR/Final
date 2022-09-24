package vExcelDataProvider;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Emp Info");
		
		//Writting the data values for sheet
		ArrayList<Object[]> empdata=new ArrayList<Object[]>();//for object array also we can design as of same way
		empdata.add(new Object[] {"Empid","Name","Job"});
		empdata.add(new Object[] {201,"David","Engineer"});
		empdata.add(new Object[] {202,"Peter","Manager"});
		empdata.add(new Object[] {203,"Suraj","Analyst"});
		
		//Using for each loop	
		int rownum=0;
		
		for(Object[] emp:empdata) //Becz empdata is in Array format
		{
			XSSFRow row=sheet.createRow(rownum++);
			int cellnum=0;
			
			for(Object value:emp) //Here the array is converted to an individual element/cell
			{
				XSSFCell cell=row.createCell(cellnum++);
				
				if(value instanceof String) //Here, if the object value is of string type then,  
					cell.setCellValue((String)value);//We are casting to convert the object value into the string value. 
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
		String filePath=".\\DataProvider\\employee.xlsx";
		FileOutputStream outstream=new FileOutputStream(filePath);
		workbook.write(outstream);
		
		outstream.close();
		System.out.println("Employee.xlsx file written sucessfully");
	}
//NOTE: we have to refresh the project after execution and we get the employee.xlsx file, 
	//later should right click on the .xlsx file ...>click to System editior...>will open in Excel file
}
