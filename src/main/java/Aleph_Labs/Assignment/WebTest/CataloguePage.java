package Aleph_Labs.Assignment.WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CataloguePage extends BasePage{
	
	By _GETITEMTITLE = By.xpath("//*[@id='content']/div[2]/div[2]/div/div[2]/div[1]/h4");
	By _ONCARTITEM = By.xpath("//*[@id='cart']/button");
	By _GETTEXTONCART = By.xpath("//*[@id='cart']/ul/li[1]/table/tbody/tr/td[2]/a");
	By _ADDITEM = By.xpath("//*[@id='content']/div[2]/div[2]/div/div[2]/div[2]/button[1]");
	By _CARTPAGE = By.xpath("//*[@id='top-links']/ul/li[4]/a");
	
	public CataloguePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	public void clickToCart() {
		clickAndWait(_ADDITEM);
	}
	
	public void clickToCheckCart() {
		clickAndWait(_ONCARTITEM);
	}
	
	public String getTextOnCart() {
		return getText(_GETTEXTONCART);
	}
	
	public String getTextTitleItem() {
		return getText(_GETITEMTITLE);
	}
	
	public void goToCart() {
		clickAndWait(_CARTPAGE);
	}

}
