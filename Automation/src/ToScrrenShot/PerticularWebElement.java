package ToScrrenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerticularWebElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();

		WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));

		// create the object
		Actions act = new Actions(driver);

		act.moveToElement(coin).perform();
		
		driver.findElement(By.xpath("//span[text()='Coins by Design']"));
		
		
	}

}
