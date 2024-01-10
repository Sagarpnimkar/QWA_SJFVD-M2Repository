package Assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Workingwithqspdemomovetoelement {
	
	public static void main(String[] args) throws InterruptedException {
			
					
					WebDriver driver=new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
					
					driver.get("https://demoapps.qspiders.com/button/buttonRightClick?sublist=1");
					
					// create object for Action class
					
					Actions act = new Actions(driver);
					
					// to perform context click method
					act.contextClick(driver.findElement(By.id("btn30"))).perform();
					
					Thread.sleep(2000);
					
					//click on yes button
					driver.findElement(By.xpath("//div[text()='Yes']")).click();
					
				
					
			}

			
	}


