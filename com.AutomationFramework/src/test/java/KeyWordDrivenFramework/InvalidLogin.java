package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// launch the browser 
		
		BaseTest test=new BaseTest();
		
		test.setup();
		
		Flib lib = new Flib ();
		
		String username = lib.getdatafromproperty(PROPERTYFILE, "Username1");
		
		String password = lib.getdatafromproperty(PROPERTYFILE, "Password1");
		
		test.driver.findElement(By.name("pwd")).sendKeys(password);

		test.driver.findElement(By.id("LoginButton")).click();
		
		Thread.sleep(20000);
		
		test.tearDown();
		
		
		
	}

}
