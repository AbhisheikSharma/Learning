package Selenium.Learning;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptImportant {
	
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		JavascriptExecutor js;
		js = (JavascriptExecutor)driver;
		js.executeScript("window.location= 'https://www.google.com';");  //-------->OPENING A WEB PAGE USING JS
		WebElement searchfield = (WebElement)js.executeScript("return document.getElementById('APjFqb');");
		searchfield.sendKeys("Something");
		Long height = (Long)js.executeScript("return window.innerHeight;");
		Long width = (Long)js.executeScript("return window.innerWidth;");
		System.out.println(height+"              " + width);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		js.executeScript("window.scrollBy(0,300);");
		
	}
	

}
