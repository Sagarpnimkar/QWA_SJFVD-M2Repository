package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.get("https://demoapps.qspiders.com/alert/prompt?sublist=2");

	driver.findElement(By.id("buttonAlert1")).click();

	// handling the prompt popup
	Alert alt = driver.switchTo().alert();

	Thread.sleep(2000);

	alt.sendKeys("yes");
	
	Thread.sleep(5000);
	
	System.out.println(alt.getText());
	
	alt.accept();
	
	}

}
