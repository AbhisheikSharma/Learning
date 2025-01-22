package Selenium.Learning;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {
	public static void main(String[] args) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://parabank.parasoft.com/");
		try {
			Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://parabank.parasoft.com/parabank/contact.htm");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		driver.quit();
	}

}
