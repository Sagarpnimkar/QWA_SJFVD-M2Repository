package Assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwithmovetoelementmyntra {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
	    WebElement fashion = driver.findElement(By.className("desktop-main"));
	
	      // create object for actions class
	      Actions Act = new Actions(driver);
	      
	      //use move element method
	      Act.moveToElement(fashion).perform();
		
	}

}
