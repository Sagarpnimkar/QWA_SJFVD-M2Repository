package Assighnment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WorkingWithIRCTC {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@role=\"searchbox\"])[1]")).sendKeys("PUNE JN - PUNE (PUNE)",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@role=\"searchbox\"])[2]")).sendKeys("MUMBAI CENTRAL - MMCT (MUMBAI)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='28']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='AC 2 Tier (2A)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c65-12 pi pi-chevron-down']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@aria-label='GENERAL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='search_btn train_Search']")).click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./screenshot/IRCTC.png");
		
		Files.copy(src,dest);

		
		
		
		
	}

}
