package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.amazon.in/");

		driver.findElement(By.name("field-keywords")).sendKeys("tv", Keys.ENTER);

		driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[1]")).click();

		// it will give parent as well as child id

		Set<String> all_id = driver.getWindowHandles();

		for (String id : all_id) {
			driver.switchTo().window(id);

			if (driver.getTitle().equals("TRUSENSE 80 cm (32 Inch) TS 3243 | 1080P Full HD Smart TV with LG Web OS | Magic Remote I Bezel-Less LED | 3 HDMI Ports I 2 USB Ports - (Black) : Amazon.in: Electronics")) 
			{
				break;
			}
		}

		driver.findElement(By.id("add-to-cart-button")).click();
	}

}
