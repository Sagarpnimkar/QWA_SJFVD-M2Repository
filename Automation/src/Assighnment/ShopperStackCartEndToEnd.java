package Assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopperStackCartEndToEnd {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.shoppersstack.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='loginBtn']")).click();
		
		//Thread.sleep(4000);
		
		driver.findElement(By.id("Email")).sendKeys("sagarnimkar02@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Sagar@123");
		
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[1]")).click();
		
		WebElement men = driver.findElement(By.xpath("//a[@name='men']"));
		
	    Actions act=new Actions(driver);
		
		act.moveToElement(men).perform();
		
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		
		
		
		
		
		
		
	}

}
