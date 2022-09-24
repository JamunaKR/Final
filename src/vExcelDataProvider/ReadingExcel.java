package vExcelDataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*; //This also we can write instead all the above imports


//........................This program is used to read the Excel datas................
public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		String excelFilePath=".\\DataProvider\\Book1.xlsx";  //.....Ulta forward slash
		FileInputStream inputstream=new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		//XSSFSheet sheet=workbook.getSheetAt(0);
		
		//Now getting inside the sheet and start performing the next
		Iterator iterator=sheet.iterator();
		while(iterator.hasNext()) {
			XSSFRow row=(XSSFRow)iterator.next();
			Iterator cellIterator=row.iterator();
			
			while(cellIterator.hasNext()) {
				XSSFCell cell=(XSSFCell)cellIterator.next();
				
				switch(cell.getCellType()) 
				{
				//Observe that Println is not used instead "Print" is used
				case STRING: System.out.print(cell.getStringCellValue()); break;
				case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
				}
				System.out.print(" | ");//Provide space with | after completion of each cell
			}
			System.out.println();//Next line after completion of each row
		}

	}

}
