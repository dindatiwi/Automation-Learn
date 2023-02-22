package Aleph_Labs.Assignment.WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

	By _GETTEXTITLE = By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[2]/a");
	By _TOGGLECOUPON = By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[1]/div[1]/h4/a");
	By _SETCOUPON = By.xpath("//*[@id='input-coupon']");
	By _APPLYCOUPON = By.xpath("//*[@id='button-coupon']");
	By _ALERT = By.xpath("/html/body/div[2]/div[1]");
	
	public CartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return getText(_GETTEXTITLE);
	}
	
	public void toggleCoupon() {
		clickAndWait(_TOGGLECOUPON);
	}
	
	public void inputCoupon(String InputCoupon) {
		setText(_SETCOUPON,InputCoupon);
	}
	
	public void applyCoupon() {
		clickAndWait(_APPLYCOUPON);
	}
	
	public String getAlert() {
		return getText(_ALERT);
		}
}
