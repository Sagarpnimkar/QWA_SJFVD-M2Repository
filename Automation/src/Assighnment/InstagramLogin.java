package Assighnment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.name("username")).sendKeys("snimkar434@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Sagar@123");
		
		driver.findElement(By.className("Log in")).click();
		
		String actual_title=driver.getTitle();
		
		if(actual_title.equals("title"))
		{
			System.out.println("test case is pass");
		}
		else
		{
			System.err.println("test case is fail");
		}
		
		}

	}
