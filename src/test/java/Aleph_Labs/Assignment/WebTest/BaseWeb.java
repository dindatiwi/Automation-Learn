package Aleph_Labs.Assignment.WebTest;

import java.time.Duration;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWeb {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
  @BeforeTest
  public void beforeMethod() {
	  WebDriverManager.firefoxdriver().setup();
	  driver.set(new FirefoxDriver());
	  explicitWait.set(new WebDriverWait(driver.get(), 60));
	  driver.get().get("http://tutorialsninja.com/demo/");
  }

  @AfterTest
  public void tearDown() {
	  driver.get().quit();
  }
}
