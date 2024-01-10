package KeyBoardStroke;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeysEnum {
	
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("http://desktop-3dlam41/login.do");
	
	driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
	
	//driver.findElement(By.name("pwd")).sendKeys("manager",Keys.TAB);
	
	//driver.findElement(By.name("remember")).sendKeys(Keys.TAB);
	
	//driver.findElement(By.id("loginButton")).click();

}
}
