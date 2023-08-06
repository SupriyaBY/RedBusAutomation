package com.sm.RedBus.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sm.RedBus.base.*;
import com.sm.RedBus.pages.HomePage;
import com.sm.RedBus.pages.SearchPage;
import com.sm.RedBus.utils.*;

public class HomePageTest extends Base{
	
	 
	@Test(priority = 1)
	public void hmPageTitleTest() {
		String actTitle = hmPage.getHomePageTitle();
		Assert.assertEquals(actTitle, AppConstants.HOME_PAGE_TITLE_VALUE);
	}
	@Test(priority = 2) 
	public void hmPageLogoTest() {
		Assert.assertTrue(hmPage.isLogoExist());
		 
		
	}
	
	@Test(priority = 3)
	public void hmPageBusTktTest() {
		hmPage.isbustktclickable();

	}

	@Test(priority = 4)
	public void hmPageCabRentalTest() {
		hmPage.iscabrentalclickable();

	}

	@Test(priority = 5)
	public void hmPageTrainTktTest() {
		hmPage.istraintktclickable();

	}

	@Test(priority = 6)
	public void hmPageHelpBtnTest() {
		hmPage.ishelpbtnclickable();

	}

	@Test(priority = 7)
	public void hmPageAccountBtnTest() {
		hmPage.isaccountclickable();

	}

	@Test(priority = 8)
	public void hmPageFromTextBoxTest() {
		Assert.assertTrue(hmPage.isfromtextboxdisplay());

	}

	@Test(priority = 9)
	public void hmPageToTextBoxTest() {
		Assert.assertTrue(hmPage.istotextboxdisplay());

	}
	
	@Test(priority = 10)
	public void checkSearchIsDisplayed() {
		srcPage=hmPage.hmPageSearchBtnTest();
		//Assert.assertTrue(srcPage.clickSearchButton());
 
	}
}

