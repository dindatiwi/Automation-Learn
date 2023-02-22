package Aleph_Labs.Assignment.WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrontPage extends BasePage {	
	By _CATALOGUE = By.linkText("Phones & PDAs");

	public FrontPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void clickToMobilePAge() {
		clickAndWait(_CATALOGUE);
	}

}
