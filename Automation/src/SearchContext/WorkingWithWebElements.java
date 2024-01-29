package SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWebElements {
	
	public static void main(String[] args) {
		
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'Pke_EE')]")).sendKeys("iphone",Keys.ENTER);
		
		 List <WebElement> allIphone = (List<WebElement>) driver.findElement(By.xpath("//div[@class='_4rR01T']"));  
		
		for (WebElement Iphone:allIphone)
			
		{
			System.out.println(Iphone.getText());
		
		}
	}

}
