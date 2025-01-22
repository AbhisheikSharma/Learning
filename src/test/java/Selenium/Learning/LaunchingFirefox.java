package Selenium.Learning;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingFirefox {
	
	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://parabank.parasoft.com/";
		//WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
