package Assighnment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class WorkingWithBlueStone {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.bluestone.com/");

		driver.findElement(By.id("denyBtn")).click();

		WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));

		// create the object
		Actions act = new Actions(driver);

		act.moveToElement(coin).perform();

		driver.findElement(By.xpath("(//span[@class='prcs-d'])[1]")).click();

		// explicit type casting
		TakesScreenshot ts = (TakesScreenshot) driver;

		// to use getScreenshot method
		File src = ts.getScreenshotAs(OutputType.FILE);

		// create a new file and pass the where you want to store screenshot and give
		File dest = new File("./screenshot/coin1.png");

		// copy from src to dest
		Files.copy(src, dest);

	}

}
