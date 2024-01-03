package Assighnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFormValidation {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/formValidation");
		
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		Thread.sleep(1000);
		
	    driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("sagar");
	    
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sagar@456");
	    
	    driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("Sagar@456");
	    
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sagar456@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://demoapps.qspiders.com/formValidation");
	    
	    driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("7845121245");
	    
	    driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("1000");
	   
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
