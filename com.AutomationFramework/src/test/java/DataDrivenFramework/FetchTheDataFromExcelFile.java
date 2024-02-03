package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchTheDataFromExcelFile {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//create the object of FileInputStream and provide the path
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		
		//open the workbook in readable mode 
		
		Workbook book = WorkbookFactory.create(fis);
		
		//get the sheet 
		
		Sheet sheet=book.getSheet("Valid");
		
		//get row
		
		Row row=sheet.getRow(1);
		
		//get cell
		
		Cell cell=row.getCell(0);
		
		//get the string value
		
		String username=cell.getStringCellValue();
		
		System.out.println(username);
		
		//For password same procedure 
		
		Sheet sheet1=book.getSheet("Valid");
		
		Row row1=sheet1.getRow(1);
		
		Cell cell1=row1.getCell(1);
		
		String password=cell1.getStringCellValue();
		
		System.out.println(password);
		
		
		
	}

}
