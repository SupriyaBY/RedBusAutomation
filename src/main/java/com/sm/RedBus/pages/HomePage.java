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
		private By bustkt = By.xpath("//img[@alt='Bus Tickets']");
		private By cabrental = By.cssSelector("#cab_rental_vertical");
		private By traintkt = By.cssSelector("#rail_tickets_vertical");
		private By help = By.xpath("/html[1]/body[1]/section[1]/header[1]/div[1]/ul[2]/li[1]/div[1]");
		
		//3. page actions:
		public String getHomePageTitle() {
			return eleUtil.waitForTitleIsAndCapture(AppConstants.HOME_PAGE_TITLE_VALUE, AppConstants.SHORT_DEFAULT_WAIT);
		}
		
		public boolean isLogoExist() {
			return eleUtil.checkElementIsDisplayed(logo);
		}
		
		public void isbustktclickable() {
			eleUtil.checkElementClickable(bustkt, AppConstants.SHORT_DEFAULT_WAIT);

		}

		public void iscabrentalclickable() {
			eleUtil.checkElementClickable(cabrental, AppConstants.SHORT_DEFAULT_WAIT);

		}

		public void istraintktclickable() {
			eleUtil.checkElementClickable(traintkt, AppConstants.SHORT_DEFAULT_WAIT);

		}

		public void ishelpbtnclickable() {
			eleUtil.checkElementClickable(help, AppConstants.SHORT_DEFAULT_WAIT);

		}

		public void isaccountclickable() {
			eleUtil.checkElementClickable(account, AppConstants.SHORT_DEFAULT_WAIT);

		}

		public boolean isfromtextboxdisplay() {
		return	eleUtil.checkElementIsDisplayed(from);
		}
		
		public boolean istotextboxdisplay() {
			return eleUtil.checkElementIsDisplayed(to);
		}
		
		public boolean issearchbtndisplay() {
			return eleUtil.checkElementIsDisplayed(search);
		}
//		public boolean isMyAccountLinkExist() {
//			return eleUtil.checkElementIsDisplayed(myAccount);
//		}
}
