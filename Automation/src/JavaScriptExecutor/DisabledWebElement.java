package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledWebElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/?scenario=1");
	    Thread.sleep(2000);
	    
	    //click on disabled webelement
	    driver.findElement(By.ByClassName.xpath("//li[text()='Disabled']")).click();
	
	    Thread.sleep(2000);
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    Thread.sleep(2000);
	    
	    js.executeScript("document.getElementById('name').value='sagar nimkar'");
	    Thread.sleep(2000);
	    
	    js.executeScript("document.getElementById('email').value='snimkar@123'");
	    Thread.sleep(2000);
	    
	    js.executeScript("document.getElementById('password').value='sagar@123'");
	    Thread.sleep(2000);
	    
	    WebElement disabledButton = driver.findElement(By.xpath("//button[text()='Register']"));
	    
	    js.executeScript("argument[0].click()",disabledButton);
	    
	    
	    
	    
	}

}
