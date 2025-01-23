package Selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeysClassSelenium {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.id("APjFqb")).sendKeys(Keys.chord(Keys.COMMAND,Keys.SHIFT,Keys.NUMPAD4));
	driver.findElement(By.id("APjFqb")).sendKeys(Keys.chord(Keys.DOWN))
	Thread.sleep(3000);
}
}
