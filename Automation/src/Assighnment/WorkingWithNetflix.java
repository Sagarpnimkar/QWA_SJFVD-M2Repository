package Assighnment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WorkingWithNetflix {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.netflix.com/in/login");
		
		driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("snimkar434@gmail.com",Keys.TAB,"Sagar@123",Keys.TAB,"",Keys.TAB,Keys.ENTER);
		
	    Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		// to use getScreenshot method
		File src = ts.getScreenshotAs(OutputType.FILE);

		// create a new file and pass the where you want to store screenshot and give
		// name
		File dest = new File("./screenshot/netflixafterlogin.png");

		// copy from src to dest
		Files.copy(src, dest);
	}

}
