package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWIthdragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		
		//drag webElement
		
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement drag2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		//drop webElement
		
		WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		WebElement drop2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement drop3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		act.dragAndDrop(drag1, drop1).perform();
		act.dragAndDrop(drag2, drop2).perform();
		act.dragAndDrop(drag3, drop3).perform();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
