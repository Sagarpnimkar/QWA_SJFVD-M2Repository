package ToScrrenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way2 
{
	public static void main(String[] args) throws IOException {


		ChromeDriver driver = new ChromeDriver();

	    driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://in.puma.com/in");

		// to use getScreenshot method
		File src =driver.getScreenshotAs(OutputType.FILE);

		// create a new file and pass the where you want to store screenshot and give
		// name
		File dest = new File("./screenshot/puma1.png");

		// copy from src to dest
		Files.copy(src, dest);
	}

}
