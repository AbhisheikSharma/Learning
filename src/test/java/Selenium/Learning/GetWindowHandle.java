package Selenium.Learning;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowHandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.merchante.com");
		String mainhandle = driver.getWindowHandle();
		System.out.println(mainhandle);
		
		Set<String> allhandles = driver.getWindowHandles();
		System.out.println("Handles is set"+ allhandles.size());
		driver.quit();
		
	}

}
