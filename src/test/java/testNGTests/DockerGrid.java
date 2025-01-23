package testNGTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerGrid {
  @Test
  public void testone() throws MalformedURLException, InterruptedException {
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setBrowserName("chrome");
	  //dc.setVersion("134.0");
	  WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
	  Thread.sleep(50000);
	  driver.quit();
  }
}
