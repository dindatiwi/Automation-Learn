package Aleph_Labs.Assignment.WebTest;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;


public class WebTest extends BaseWeb {

	CartPage cartPage = new CartPage(driver, explicitWait);
	CataloguePage catalogPage = new CataloguePage(driver, explicitWait);
	FrontPage dashboard = new FrontPage(driver, explicitWait);

	String _COUPON = "kupon";
	String _ALERT = "Warning: Coupon is either invalid, expired or reached its usage limit!\n×";
	

	@Test
	public void verify_title() {
		
		dashboard.clickToMobilePAge();
		
		String getItemNameInCatalogpage = catalogPage.getTextTitleItem();
		
		catalogPage.clickToCart();
		
		catalogPage.goToCart();
		
		String getItemNameInCartPage = cartPage.getTitle();

		try {
			//assert title on mobile page
		  	Assert.assertEquals(getItemNameInCartPage, getItemNameInCatalogpage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cartPage.toggleCoupon();
		cartPage.inputCoupon(_COUPON);
		cartPage.applyCoupon();
		String alert = cartPage.getAlert();
		try {
			//assert title on mobile page
		  	Assert.assertEquals(alert, _ALERT);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
