package Assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitimeCreateAndDelete {
	
	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-3dlam41/login.do;jsessionid=1qfhbgsom0mtr");
		
        driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.name("remember")).click();
		
		driver.findElement(By.id("loginButton")).click();
		
		Actions act=new Actions(driver);
		
	    act.doubleClick(driver.findElement(By.xpath("//div[text()='Users']"))).perform();
	    
	    driver.findElement(By.xpath("//input[@value='Create New User']")).click();
	    
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sagarnimkar1@gmail5.com");
	    
	    driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sagar");
	    
	    driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Nimkar");
	    
	    driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("Nimkar@123");
	    
	    driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("Nimkar@123");
	    
	    driver.findElement(By.xpath("//input[@name='workdayDurationStr']")).sendKeys("");
	    
	    driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	    driver.findElement(By.xpath(""));
	}

}
