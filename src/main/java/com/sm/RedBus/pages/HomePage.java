package com.sm.RedBus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sm.RedBus.utils.AppConstants;
import com.sm.RedBus.utils.ElementUtil;

public class HomePage {
	private WebDriver driver;
	private ElementUtil eleUtil;

	//1. const. of the page class
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
	}
	
	//2. by locators:
		private By logo = By.xpath("//*[@id=\"main_header_new\"]/div/img");
		private By account = By.xpath("//*[@id=\"account_dd\"]/div[1]/span");
		private By from = By.id("src");
		private By to =By.cssSelector("#dest") ;
		private By search = By.xpath("//*[@id=\"search_button\"]");
		
		//3. page actions:
		public String getHomePageTitle() {
			return eleUtil.waitForTitleIsAndCapture(AppConstants.HOME_PAGE_TITLE_VALUE, AppConstants.SHORT_DEFAULT_WAIT);
		}
		
		public boolean isLogoExist() {
			return eleUtil.checkElementIsDisplayed(logo);
		}
		
//		public boolean isMyAccountLinkExist() {
//			return eleUtil.checkElementIsDisplayed(myAccount);
//		}
}
