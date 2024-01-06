package DropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithgetWrappedElement {
	
	public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Sagar/OneDrive/Desktop/Dropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("Dropdown"));
		
		Select s=new Select (dropdown);
		
		WebElement alloption=s.getWrappedElement();
		
		System.out.println(alloption.getText());
	}

}
