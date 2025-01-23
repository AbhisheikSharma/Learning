package Selenium.Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.merchante.com';");
		Thread.sleep(5000);
		//driver.switchTo().frame(0);
		//WebElement rejectcookies = driver.findElement(By.xpath("//button[text()='Reject all'][@type='button']"));
		//rejectcookies.click();
		//driver.switchTo().defaultContent();
		WebElement ele = driver.findElement(By.xpath("//h3[contains(text(),'We understand the excitement')]//following-sibling::a"));
		System.out.println(ele.getText());
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		action.click(ele);
		Thread.sleep(4000);
		driver.quit();
		
		

	}
}
