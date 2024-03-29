package PomPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	
    static WebDriver driver;
	
	//method for common data
	
	public void setup() throws IOException {
		
		Flib lib=new Flib();
		
		String browser = lib.getdatafromproperty(PROPERTYFILE, "Browser");
		
		String url = lib.getdatafromproperty(PROPERTYFILE, "Url");
		
		if(browser.equals("Chrome"))
		{
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
			
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECOND));
		
		driver.get(url);
		
	}
	
	//method for close 
	
	public void tearDown()
	
	{
		driver.quit();
	}

}
