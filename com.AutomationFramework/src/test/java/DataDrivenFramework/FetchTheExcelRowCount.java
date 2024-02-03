package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class FetchTheExcelRowCount {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		Flib lib = new Flib();
		int count = lib.getRowCount("./src/test/resources/TestData.xlsx", "Valid");
		
		System.out.println(count);
		
		
		
	}

}
