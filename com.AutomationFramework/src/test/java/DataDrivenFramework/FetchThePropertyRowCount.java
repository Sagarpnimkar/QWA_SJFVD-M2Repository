package DataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class FetchThePropertyRowCount  {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		Flib lib = new Flib();
		String count = lib.getdatafromproperty("./src/test/resources/CommonData.prperty", "Valid");
		
		System.out.println(count);

		
	}

}
