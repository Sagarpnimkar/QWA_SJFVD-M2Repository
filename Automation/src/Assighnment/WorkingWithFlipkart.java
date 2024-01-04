package Assighnment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFlipkart {
	
	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			
			driver.findElement(By.xpath("//span[text()='✕']")).click();
			
			driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("iphone",Keys.ENTER); 
			 
			List<WebElement> allIphoneprice = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			
			List<WebElement> allIphone = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
				
				
				 for(int i=0;i<allIphoneprice.size();i++)
    			 {
    				 String name=allIphoneprice.get(i).getText();
    				 for(int j=i;j<=i;j++)
    				 {
    					 String price=allIphone.get(j).getText();
    					 
    					 System.out.println(name+" : "+price);
    				 }
				
			}
	}}
			
			
	


