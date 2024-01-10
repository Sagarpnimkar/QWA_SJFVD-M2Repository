package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithclickAndHold {
	
	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		
		//identify the circle
		WebElement circle = driver.findElement(By.id("circle"));
		
		//create the object 
		Actions act=new Actions(driver);
		
		act.clickAndHold(circle).perform();
		
		act.release(circle).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
