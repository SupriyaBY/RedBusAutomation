package com.sm.RedBus.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import com.sm.RedBus.factory.DriverFactory;
import com.sm.RedBus.pages.HomePage;
import com.sm.RedBus.pages.LoginPage;



public class Base {

	protected LoginPage loginPage;
	protected HomePage hmPage;
	
	WebDriver driver;
	protected DriverFactory df;
	protected Properties prop;
	protected SoftAssert softAssert;

	@Parameters({ "browser", "browserversion" })
	@BeforeTest
	public void setup(String browserName, String browserVersion) {
		df = new DriverFactory(); // obj of DriverFactory class in SrcMainJava
		prop = df.initProp();
		if (browserName != null) {
			prop.setProperty("browser", browserName);
			prop.setProperty("browserversion", browserVersion);
		}
		driver = df.initDriver(prop);

		hmPage = new HomePage(driver);
		//loginPage = new LoginPage(driver);
		softAssert = new SoftAssert();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
