package com.sm.RedBus.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sm.RedBus.base.Base;

public class HomePageFooter2Test extends Base {

// about us
	
	@BeforeTest
	public void footerTestSetUp() {
		ft2Page = hmPage.footerSetUp();
	}

	@Test(priority = 1)
	public void hmPageAboutUsTest() {
		Assert.assertTrue(ft2Page.isaboutusclickable());
	}

	@Test(priority = 2)
	public void hmPageInvestorRelationsTest() {
		ft2Page.isinvestorrelationsclickable();
	}

	@Test(priority = 3)
	public void hmPageContactUsTest() {
		ft2Page.iscontactusclickable();
	}

	@Test(priority = 4)
	public void hmPageMobileVersionTest() {
		ft2Page.ismobileversionclickable();
	}

	@Test(priority = 5)
	public void hmPageRedbusOnMobileTest() {
		ft2Page.isredbusonmobileclickable();
	}

	@Test(priority = 6)
	public void hmPageSitemapTest() {
		ft2Page.issitemapclickable();
	}

	@Test(priority = 7)
	public void hmPageOffersTest() {
		ft2Page.isoffersclickable();
	}

	@Test(priority = 8)
	public void hmPageCareersTest() {
		ft2Page.iscareersclickable();
	}

	@Test(priority = 9)
	public void hmPageValuesTest() {
		ft2Page.isvaluesclickable();
	}

	// info

	@Test(priority = 10)
	public void hmPagetermsandsconditionsTest() {
		ft2Page.istermconditionsclickable();
	}

	@Test(priority = 11)
	public void hmPrivacyPolicyTest() {
		ft2Page.isprivacypolicyclickable();
	}

	@Test(priority = 12)
	public void hmPagefaqTest() {
		ft2Page.isfaqclickable();
	}

	@Test(priority = 13)
	public void hmPageBlogTest() {
		ft2Page.isblogclickable();
	}

	@Test(priority = 14)
	public void hmPageBusOperatorRegistrationTest() {
		ft2Page.isbusoperatorregistrationclickable();
	}

	@Test(priority = 15)
	public void hmPageAgentRegistraionTest() {
		ft2Page.isagentregistrationclickable();
	}

	@Test(priority = 16)
	public void hmPageInsurancePartnerTest() {
		ft2Page.isinsuranceprtnerclickable();
	}

	@Test(priority = 17)
	public void hmPageUserAgreementTest() {
		ft2Page.isuseragreementclickable();
	}

	// Global sites

	@Test(priority = 18)
	public void hmPageindia_siteTest() {
		ft2Page.isindia_siteclickable();
	}

	@Test(priority = 19)
	public void hmPagecolombia_siteTest() {
		ft2Page.iscolombia_siteclickable();
		;

	}

	@Test(priority = 20)
	public void hmPagesingapore_siteTest() {
		ft2Page.issingapore_siteclickable();
		;

	}

	@Test(priority = 21)
	public void hmPagemalaysia_siteTest() {
		ft2Page.ismalaysia_siteclickable();
		;

	}

	@Test(priority = 22)
	public void hmPageindonesia_siteTest() {
		ft2Page.isindonesia_siteclickable();
		;

	}

	@Test(priority = 23)
	public void hmPageperu_siteTest() {
		ft2Page.isperu_siteclickable();
		;

	}

	// Our partners

	@Test(priority = 24)
	public void hmPageGoibiboBusTest() {
		ft2Page.isgoibibobusclickable();

	}

	@Test(priority = 25)
	public void hmPageMakeMyTripBusTest() {
		ft2Page.ismakemytripbusclickable();

	}

	@Test(priority = 26)
	public void hmPageGiibiboHotelsTest() {
		ft2Page.isgoibibohotelsclickable();

	}

	@Test(priority = 27)
	public void hmPageMakeMyTripHotelsTest() {
		ft2Page.ismakemytriphotelsclickable();

	}

}
