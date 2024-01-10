package DropDownHandling;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicatevalue {
	
	public static void main(String[] args) {
		
        WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/Sagar/OneDrive/Desktop/Dropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("Dropdown"));
		
		Select s=new Select (dropdown);
		
		List<WebElement> allDuplicate = s.getOptions();
		
		TreeSet<String> set=new TreeSet<String>();
		
		for(int i=0; i<allDuplicate.size();i++)
		{
			String allOption=allDuplicate.get(i).getText();
			
			set.add(allOption);
		}
		for(String option:set)
		{
			System.out.println(option);
		}
	}
}


