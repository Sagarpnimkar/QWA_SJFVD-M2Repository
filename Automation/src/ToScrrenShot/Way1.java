package ToScrrenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://in.puma.com/in");
		
		//explicit type casting 
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//to use getScreenshot method
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//create a new file and pass the where you want to store screenshot and give name 
		File dest=new File("./screenshot/puma.png");
		
		//copy from src to dest
		Files.copy(src, dest);

	}

}
