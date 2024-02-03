package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class FetchDataFromExcelFIleJava {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		Flib lib = new Flib();
		String username = lib.getDataFromExcelSheet("./src/test/resources/TestData.xlsx", "Valid", 1,0);
		
		System.out.println(username);
	}

}
