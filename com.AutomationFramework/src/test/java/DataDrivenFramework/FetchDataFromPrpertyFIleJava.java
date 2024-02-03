package DataDrivenFramework;

import java.io.IOException;

public class FetchDataFromPrpertyFIleJava {
	
	public static void main(String[] args) throws IOException {
		
		Flib lib = new Flib();
		String browser = lib.getdatafromproperty("./src/test/resources/CommonData.properties", "Browser");
		
		System.out.println(browser);
		
		
	}

}
