package Aleph_Labs.Assignment.MobileTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.functions.ExpectedCondition;

public class MobileTest extends BaseMobile {

	@Test
	public void main() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 60);
	
		WebElement usernameinput = wait.until(ExpectedConditions.visibilityOfElementLocated(new MobileBy.ByAccessibilityId("textInputEditTextName")));
		usernameinput.sendKeys("abc");
	}
}
