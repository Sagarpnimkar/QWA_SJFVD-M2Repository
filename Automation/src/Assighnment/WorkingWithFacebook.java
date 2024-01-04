package Assighnment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

    	public class WorkingWithFacebook {

    		public static void main(String[] args) {
    			
    			WebDriver driver = new ChromeDriver();
    			
    			driver.manage().window().maximize();
    			
    			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    			
    			driver.get("https://www.facebook.com/");
    			
    			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
    			
    			driver.findElement(By.name("firstname")).sendKeys("sagar");
    			
    			driver.findElement(By.name("lastname")).sendKeys("nimkar");
    			
    			driver.findElement(By.name("reg_email__")).sendKeys("sagar22@gmail.com");
    			
    			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sagar22@gmail.com");
    			
    			driver.findElement(By.name("reg_passwd__")).sendKeys("sagar@22");
    			
    		    WebElement dropdown = 	driver.findElement(By.name("birthday_day"));
    		
    		    Select s = new Select(dropdown);
    		
    		    s.selectByIndex(28);
    		     
    		    WebElement down=   driver.findElement(By.id("month"));
    		 
    		    Select v = new Select(down);
    		 
    		    v.selectByVisibleText("Jun");
    		      
    		    WebElement drop =  driver.findElement(By.id("year"));
    		  
    		    Select m = new Select(drop);
    			
    		    m.selectByValue("2001");
    			
    		    WebElement checkbox = 	driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
    		
    		     checkbox.click();
    		     
    		    driver.findElement(By.id("u_2_s_CN")).click();
    		  
    			
    		

	}

}
