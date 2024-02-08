package PomPackage;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		

		BaseTest test = new BaseTest();

		test.setup();
		
		LoginPage lp=new LoginPage(driver);

		Flib lib = new Flib();
		
	    int rowcount=lib.getRowCount(EXCELPATH2, SHEETNAME2);
	    
	    System.out.println(rowcount);
	    
	    for(int i=0; i<=rowcount;i++)
	    {
	    	//Thread.sleep(2000);
	    	lp.InvalidLoginIntoActitime(lib.getDataFromExcelSheet(EXCELPATH2, SHEETNAME2, i, 0), lib.getDataFromExcelSheet(EXCELPATH2, SHEETNAME2, i, 1));
	    }
		
	}

}
