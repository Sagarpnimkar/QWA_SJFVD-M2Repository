package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameByIndex {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");

		// switch to frame by using index

		driver.switchTo().frame(0);

		// enter the mobile no into mobile no text field

		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("5545454545");

	}

}
