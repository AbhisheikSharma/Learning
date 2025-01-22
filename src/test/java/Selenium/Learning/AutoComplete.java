package Selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {
	public static void main(String[] args) {
		JavascriptExecutor js;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com");
		driver.navigate().refresh();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement ele = driver.findElement(By.xpath("//button[@aria-label='Where to?']"));
		ele.click();
		WebElement inputfield = driver.findElement(By.xpath("//input[@placeholder='Going to']"));
		System.out.println("Element found:"+ inputfield.getAttribute("type"));
		inputfield.click();
		inputfield.sendKeys("Ind");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	WebElement destination = driver.findElement(By.xpath("//button[@aria-label='India']"));
	destination.click();
	}

}
