package Selenium.Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		WebElement cars = driver.findElement(By.id("carselect"));
	
		Select sel = new Select(cars);
		try {
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByVisibleText("Honda");
		Thread.sleep(2000);
		WebElement multisel = driver.findElement(By.id("multiple-select-example"));
		sel = new Select(multisel);
		sel.selectByIndex(2);
		sel.selectByValue("orange");
		List<WebElement> mylist = sel.getAllSelectedOptions();
		for(WebElement element:mylist) {
			System.out.println(element.getText());
		}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		driver.quit();
	}

}
