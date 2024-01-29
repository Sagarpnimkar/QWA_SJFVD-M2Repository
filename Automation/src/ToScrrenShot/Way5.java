package ToScrrenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Way5 {

	public static void main(String[] args) throws IOException, InterruptedException {

		RemoteWebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.tcs.com/");
		
		Thread.sleep(10000);
		
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		
		File src=efw.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./screenshot/tcs.png");
		
		Files.copy(src, dest);
	}

}
