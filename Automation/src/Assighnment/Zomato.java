package Assighnment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
		
		public static void main(String[] args) {
			
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.zomato.com/pune/collections");
			
		    String currenturl =driver.getCurrentUrl();
		   
		    System.out.println("The current url of webpage is:" +currenturl);
		    
		    String title= driver.getTitle();
		 
		    System.out.println("The Title of webpage is:" +title);	
		    
		    //driver.switchTo().activeElement().sendKeys("biryani",Keys.ENTER).;
		    
		    
		    driver.close();
		}

	}

