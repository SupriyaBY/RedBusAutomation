package com.sm.RedBus.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.sm.RedBus.base.*;
import com.sm.RedBus.pages.HomePage;
import com.sm.RedBus.utils.*;

public class HomePageTest extends Base{
	

	@Test
	public void hmPageTitleTest() {
		String actTitle = hmPage.getHomePageTitle();
		Assert.assertEquals(actTitle, AppConstants.HOME_PAGE_TITLE_VALUE);
	}
	@Test 
	public void hmPageLogoTest() {
		boolean actLogo =hmPage.isLogoExist();
		Assert.assertEquals(actLogo, true);
		
	}
	


}
