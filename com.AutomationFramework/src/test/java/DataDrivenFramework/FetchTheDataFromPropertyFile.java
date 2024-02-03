package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchTheDataFromPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		//create the object of fileInputStream class
		
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		
		//create the object of properties class 
		
		Properties prop=new Properties();
		
		//Load all the keys inside your script
		
		prop.load(fis);
		
		//with the help of key access the value 
		
		String browser = prop.getProperty("Browser");
		
		System.out.println(browser);
	}

}
