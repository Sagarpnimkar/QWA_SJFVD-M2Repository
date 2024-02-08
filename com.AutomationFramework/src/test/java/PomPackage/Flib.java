package PomPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flib {

	//

	public String getdatafromproperty(String Path, String Key) throws IOException

	{

		FileInputStream fis = new FileInputStream(Path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(Key);
		return value;
	}

	public String getDataFromExcelSheet(String path, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException

	{
		FileInputStream fis = new FileInputStream(path);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(sheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		String data = cell.getStringCellValue();

		return data;

	}

	// method to check how many row are there in excel sheet

	public int getRowCount(String path, String sheetName) throws EncryptedDocumentException, IOException

	{
		FileInputStream fis = new FileInputStream(path);

		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(sheetName);

		int count = sheet.getLastRowNum();

		return count;

	}
	

}
