package Aleph_Labs.Assignment.MobileTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.touch.offset.PointOption;

public class MobileTest extends BaseMobile {
	
	String _TEXTEMAIL = "com.loginmodule.learning:id/textInputEditTextEmail";
	String _TEXTPASSWORD = "com.loginmodule.learning:id/textInputEditTextPassword";
	String _LOGINBTN = "com.loginmodule.learning:id/appCompatButtonLogin";
	String _REGISTERBTN = "com.loginmodule.learning:id/textViewLinkRegister";
	String _NAMEREGIST = "com.loginmodule.learning:id/textInputEditTextName";
	String _PASSCONFIRM = "com.loginmodule.learning:id/textInputEditTextConfirmPassword";
	String _REGISTBTN = "com.loginmodule.learning:id/appCompatButtonRegister";
	String _BACKTOLOGINBTN = "com.loginmodule.learning:id/appCompatTextViewLoginLink";
	String _SNACKBARLOGIN = "com.loginmodule.learning:id/snackbar_text";
	String _EMAILVERIFY = "com.loginmodule.learning:id/textViewEmail";

	
	@Test
	public void userRegist() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		AndroidElement loginBtn = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_REGISTERBTN)));
		loginBtn.click();
		AndroidElement nameInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_NAMEREGIST)));
		nameInput.sendKeys("sukses login");
		AndroidElement emailInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTEMAIL)));
		emailInput.sendKeys("test@g.com");
		AndroidElement passInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTPASSWORD)));
		passInput.sendKeys("test");
		AndroidElement passConfirmInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_PASSCONFIRM)));
		passConfirmInput.sendKeys("test");
		AndroidElement registerBtn = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_REGISTBTN)));
		registerBtn.click();
		AndroidElement snackBar = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_SNACKBARLOGIN)));
		String snackBarText = snackBar.getText();
		Assert.assertEquals(snackBarText, "Registration Successful");
	}
	
	@Test
	public void UserLogin() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		TouchAction action = new TouchAction(driver);
		AndroidElement goToRegisterBtn = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_REGISTERBTN)));
		goToRegisterBtn.click();
		AndroidElement nameInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_NAMEREGIST)));
		nameInput.sendKeys("sukses login");
		AndroidElement emailInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTEMAIL)));
		emailInput.sendKeys("test@g.com");
		AndroidElement passInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTPASSWORD)));
		passInput.sendKeys("test");
		AndroidElement passConfirmInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_PASSCONFIRM)));
		passConfirmInput.sendKeys("test");
		AndroidElement registerBtn = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_REGISTBTN)));
		registerBtn.click();
		action.press(PointOption.point(535,500)).moveTo(PointOption.point(525,400)).release().perform();
		AndroidElement backToLoginBtn = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_BACKTOLOGINBTN)));
		backToLoginBtn.click();
		AndroidElement emailInputLogin = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTEMAIL)));
		emailInputLogin.sendKeys("test@g.com");
		AndroidElement passInputLogin = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTPASSWORD)));
		passInputLogin.sendKeys("test");
		AndroidElement loginBtn = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_LOGINBTN)));
		loginBtn.click();
		AndroidElement emailRegistered = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_EMAILVERIFY)));
		String emailText = emailRegistered.getText();
		Assert.assertEquals(emailText, "test@g.com");
	}
	
	@Test
	public void failedLogin() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		AndroidElement emailInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTEMAIL)));
		emailInput.sendKeys("test@g.com");
		AndroidElement passInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTPASSWORD)));
		passInput.sendKeys("test");
		AndroidElement loginBtn = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_LOGINBTN)));
		loginBtn.click();
		AndroidElement snackBar = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_SNACKBARLOGIN)));
		String snackBarText = snackBar.getText();
		Assert.assertEquals(snackBarText, "Wrong Email or Password");
//		Wrong Email or Password
	}
	
	@Test
	public void failedRegist() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		AndroidElement loginBtn = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_REGISTERBTN)));
		loginBtn.click();
		AndroidElement nameInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_NAMEREGIST)));
		nameInput.sendKeys("sukses login");
		AndroidElement emailInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTEMAIL)));
		emailInput.sendKeys("testg.com");
		AndroidElement passInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_TEXTPASSWORD)));
		passInput.sendKeys("test");
		AndroidElement passConfirmInput = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_PASSCONFIRM)));
		passConfirmInput.sendKeys("test");
		AndroidElement registerBtn = (AndroidElement) wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id(_REGISTBTN)));
		registerBtn.click();
	}
}
