package Assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithActiTime {

	public static void main(String[] args) throws InterruptedException {
          
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=3fah6vkhjs88");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.name("remember")).click();
		
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.className("Tasks")).click();
		
		driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		
		driver.findElement(By.name("customerId")).click();
		
		
		driver.findElement(By.name("customerName")).sendKeys("sagar");
		
		driver.findElement(By.name("projectName")).sendKeys("login");
		
		driver.findElement(By.name("task[0].name")).sendKeys("do login in the page");
		
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
