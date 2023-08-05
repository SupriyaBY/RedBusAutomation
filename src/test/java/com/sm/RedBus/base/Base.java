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
import com.sm.RedBus.pages.SearchPage;
import com.sm.RedBus.pages.TrainTicketPage;
//import com.sm.RedBus.pages.ResultPage;
import com.sm.RedBus.utils.JavaScriptUtil;

public class Base {

	protected LoginPage loginPage;
	protected HomePage hmPage;
	protected JavaScriptUtil jsu;
	WebDriver driver;
	protected DriverFactory df;
	protected Properties prop;
	protected SoftAssert softAssert;
	protected SearchPage srcPage;
	protected TrainTicketPage ttPage;

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
		// loginPage = new LoginPage(driver);
		srcPage = new SearchPage(driver);
		softAssert = new SoftAssert();
		ttPage = new TrainTicketPage(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
