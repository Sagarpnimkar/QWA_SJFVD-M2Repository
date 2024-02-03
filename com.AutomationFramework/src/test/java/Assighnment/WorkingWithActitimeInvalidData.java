package Assighnment;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDrivenFramework.Flib;

public class WorkingWithActitimeInvalidData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://sagarwindows11/login.do");

		Flib lib = new Flib();
		int count = lib.getRowCount("./src/test/resources/TestDataInvalid.xlsx", "Invalid");

		for (int i = 1; i <=count; i++)

		{
			String username = lib.getDataFromExcelSheet("./src/test/resources/TestDataInvalid.xlsx", "Invalid", i, 0);

			String password = lib.getDataFromExcelSheet("./src/test/resources/TestDataInvalid.xlsx", "Invalid", i, 1);
			
			WebElement user=driver.findElement(By.name("username"));
			user.sendKeys(username);
			
			WebElement pass = driver.findElement(By.name("pwd"));
			pass.sendKeys(password);

		//	driver.findElement(By.id("LoginButton")).click();
			
			user.clear();
			
			pass.clear();
			
			
			
		}

	}

}
