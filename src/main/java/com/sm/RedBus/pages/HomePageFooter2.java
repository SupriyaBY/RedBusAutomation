package com.sm.RedBus.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sm.RedBus.utils.ElementUtil;
import com.sm.RedBus.utils.JavaScriptUtil;

public class HomePageFooter2 {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	private  JavaScriptUtil jsu;


	//1. const. of the page class
	public HomePageFooter2(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(this.driver);
		jsu = new JavaScriptUtil(this.driver);
	}
	
	private By aboutus = By.cssSelector("#about_us_footer");
    private By contactus = By.partialLinkText("Contact");
    private By investorrelations = By.cssSelector("#investor_relations_footer");
    private By mobileversion = By.cssSelector("#mobile_version_footer");
    private By redbusonmobile = By.xpath("//a[@id='redbus_on_bus_footer']");
    private By sitemap = By.xpath("//a[@id='sitemap_footer']");
    private By offers = By.xpath("//a[@id='offers_footer']");
    private By careers = By.xpath("//a[@id='careers_footer']");
    private By values = By.xpath("//a[@id='values_footer']");
   
    private By terms_conditions = By.xpath("//a[@id='terms_n_conditions_footer']");
    private By privacypolicy = By.cssSelector("#privacy_policy_footer");
    private By faq = By.partialLinkText("FAQ");
    private By blog = By.partialLinkText("Blog");
    private By busoperatorregistration = By.xpath("//a[@id='bus_operator_registration_footer']");
    private By agentregistration = By.xpath("//a[@id='agent_registration_footer']");
    private By insurancepartner = By.cssSelector("#insurance_partner_footer");
    private By useragreement = By.cssSelector("#user_agreement_footer");
   
    private By india_site = By.xpath("//a[@id=\"India_site_footer\"]");
    private By colombia_site = By.xpath("//a[@id=\"colombia_site_footer\"]");
     private By singapore_site = By.xpath("//a[@id='singapore_site_footer']");
     private By malaysia_site = By.xpath("//a[@id='malaysia_site_footer']");
    private By indonesia_site = By.xpath("//a[@id='indonesia_site_footer']");
    private By preu_site = By.xpath("//a[@id='peru_site_footer']");
    
    private By goibibobus = By.xpath("//a[@id='goibibo_bus_footer']");
    private By goibibohotels = By.cssSelector("#goibibo_hotels_footer");
    private By makemytripbus = By.partialLinkText("Makemytrip Bus");
    private By makemytriphotels = By.xpath("//a[@id='makemytrip_hotels_footer']");
	   
    
	
	public boolean isaboutusclickable() {
		
		jsu.scrollPageDown();
		 return eleUtil.checkvisibleandclickable(aboutus);
		 		
	}
	
	public boolean isinvestorrelationsclickable() {
		 return eleUtil.checkvisibleandclickable(investorrelations);

	}
	public boolean iscontactusclickable() {
		 return eleUtil.checkvisibleandclickable(contactus);

	}
	
	public boolean ismobileversionclickable() {
		 return eleUtil.checkvisibleandclickable(mobileversion);

	}
	public boolean isredbusonmobileclickable() {
		 return eleUtil.checkvisibleandclickable(redbusonmobile);

	}
	public boolean issitemapclickable() {
		 return eleUtil.checkvisibleandclickable(sitemap);

	}
	public boolean isoffersclickable() {
		 return eleUtil.checkvisibleandclickable(offers);

	}
	public boolean iscareersclickable() {
		 return eleUtil.checkvisibleandclickable(careers);

	}
	public boolean isvaluesclickable() {
		 return eleUtil.checkvisibleandclickable(values);

	}
	
//Info
	
	public boolean istermconditionsclickable() {
	   return eleUtil.checkvisibleandclickable(terms_conditions);
	}
	
	public boolean isprivacypolicyclickable() {
		   return eleUtil.checkvisibleandclickable(privacypolicy);
		}
		
	public boolean isfaqclickable() {
		return eleUtil.checkvisibleandclickable(faq );
	}
	
	public boolean isblogclickable() {
		return eleUtil.checkvisibleandclickable(blog );
	}
	
	public boolean isbusoperatorregistrationclickable() {
		return eleUtil.checkvisibleandclickable(busoperatorregistration);
	}
	
	public boolean isagentregistrationclickable() {
		return eleUtil.checkvisibleandclickable(agentregistration );
	}
	
	public boolean isinsuranceprtnerclickable() {
		return eleUtil.checkvisibleandclickable(insurancepartner );
	}
	
	public boolean isuseragreementclickable() {
		return eleUtil.checkvisibleandclickable(useragreement );
	}

//Global sites
	public boolean isindia_siteclickable() {
		return eleUtil.checkvisibleandclickable(india_site);
	}
	
	public boolean iscolombia_siteclickable() {
		return eleUtil.checkvisibleandclickable(colombia_site);
		
	}
	public boolean issingapore_siteclickable() {
		return eleUtil.checkvisibleandclickable(singapore_site);
		
	}
	public boolean ismalaysia_siteclickable() {
		return eleUtil.checkvisibleandclickable(malaysia_site);
		
	}
	public boolean isindonesia_siteclickable() {
		return eleUtil.checkvisibleandclickable(indonesia_site);
		
	}
	public boolean isperu_siteclickable() {
		return eleUtil.checkvisibleandclickable(preu_site);
		
	}
	
//our partners
	
	public boolean isgoibibobusclickable() {
		return eleUtil.checkvisibleandclickable(goibibobus);
		
	}
	
	public boolean ismakemytripbusclickable() {
		return eleUtil.checkvisibleandclickable(makemytripbus);
		
	}
	
	public boolean isgoibibohotelsclickable() {
		return eleUtil.checkvisibleandclickable(goibibohotels);
		
	}
	
	public boolean ismakemytriphotelsclickable() {
		return eleUtil.checkvisibleandclickable(makemytriphotels);
		
	}
	

}
