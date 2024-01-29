package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGoogleMap {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();

		// switch to frame by using index

		driver.switchTo().frame("app");

		driver.findElement(By.xpath("//span[@data-text='Maps']")).click();
		
		

	}

}
