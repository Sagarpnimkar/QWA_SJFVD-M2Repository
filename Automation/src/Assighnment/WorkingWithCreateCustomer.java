package Assighnment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCreateCustomer {

	public static void main(String[] args) throws InterruptedException {
		
	   Random r=new Random();
	   
	   int no=r.nextInt(100);

       WebDriver driver=new ChromeDriver();
       
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
       driver.get("http://desktop-3dlam41/login.do");
       
       driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
       
       driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
       
       driver.findElement(By.name("remember")).click();
       
       driver.findElement(By.id("loginButton")).click();
       
       driver.findElement(By.className("Tasks")).click();
    
       driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
       
       driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
       
       driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sagar"+no);
       
       driver.findElement(By.xpath("//input[@type='submit']")).click();
       Thread.sleep(3000);
       
       driver.close();
       
       
       
       
		

	}

}
