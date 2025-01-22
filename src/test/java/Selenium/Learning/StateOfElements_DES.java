package Selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StateOfElements_DES {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();	
	WebDriver driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com");
	WebElement atmservicestab = driver.findElement(By.cssSelector("Li.captionone"));
	System.out.println("Selected?:" + atmservicestab.isSelected());
	System.out.println("Enabled?:"+ atmservicestab.isEnabled());
	System.out.println("Displayed?:"+ atmservicestab.isDisplayed());
	
		
	}

}
