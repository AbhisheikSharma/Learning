package Selenium.Learning;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {
	public static void main(String[] args) {
		Screenshots takingss = new Screenshots();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.merchante.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		takingss.getScreenshot(driver);
}
public void getScreenshot(WebDriver driver) {
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File("./Screenshots/"+ Screenshots.class.getName()+helperMethod()+".png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public String helperMethod() {
	DateFormat df = new SimpleDateFormat("MM-dd_yyyy_HH_mm_ss");
	Date dt = new Date();
	return df.format(dt);
}
	
}
