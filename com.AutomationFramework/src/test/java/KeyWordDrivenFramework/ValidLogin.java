package KeyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {

		// Launch the browser

		BaseTest test = new BaseTest();

		test.setup();

		Flib lib = new Flib();

		String username = lib.getdatafromproperty(PROPERTYFILE, "Username");

		String password = lib.getdatafromproperty(PROPERTYFILE, "Password");

		test.driver.findElement(By.name("username")).sendKeys(username);

		test.driver.findElement(By.name("pwd")).sendKeys(password);

		test.driver.findElement(By.id("LoginButton")).click();
		
		test.tearDown();
	}

}
