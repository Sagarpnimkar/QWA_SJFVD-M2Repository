package Assighnment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WorkingWithPayTM {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://paytm.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1000)");

		driver.findElement(By.xpath("//div[text()='Flight']")).click();
		Thread.sleep(2000);

		// from
		driver.findElement(By.id("srcCode")).click();

		driver.findElement(By.xpath("//img [@class='_3i2Wp']")).click();

		driver.findElement(By.className("_1X2Sn")).click();

		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();

		// To
		driver.findElement(By.id("destCode")).click();

		driver.findElement(By.xpath("//img [@class='_3i2Wp']")).click();

		driver.findElement(By.className("_1X2Sn")).click();

		driver.findElement(By.xpath("//div[text()='Ayodhya, Uttar Pradesh, India']")).click();
		
		
		//date
		driver.findElement(By.id("departureDate")).click();
		
		driver.findElement(By.xpath("(//div[text()='23'])[1]")).click();
		
		//candidate
		driver.findElement(By.id("travellerClass")).click();
		
		for(int i=0; i<2; i++)
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='add-icon']")).click();
		}
		
		driver.findElement(By.id("flightSearch")).click();
		
		//All the flight in your console 
	    List<WebElement> Allflight = driver.findElements(By.xpath("(//div[@class='_5Cbbf'])[1]"));
		
		for (WebElement flight:Allflight)
		{
			System.out.println(flight.getText());
			System.out.println("------------------------------------");
		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		// to use getScreenshot method
		File src = ts.getScreenshotAs(OutputType.FILE);

		// create a new file and pass the where you want to store screenshot and give
		// name
		File dest = new File("./screenshot/FlightAll.png");

		// copy from source to destination
		Files.copy(src, dest);

		Thread.sleep(5000);

		driver.close();

	}

}
