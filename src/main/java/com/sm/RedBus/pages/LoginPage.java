package com.sm.RedBus.pages;

import org.openqa.selenium.WebDriver;

import com.sm.RedBus.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
	}

	 
}
