package com.tripa.qa.TestPages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tripa.qa.BaseClass.TestBase;
import com.tripa.qa.pages.Pages.Tripa_SeachPage;

public class SearchPage_Test extends TestBase{

public static Tripa_SeachPage searchpage;

	public SearchPage_Test() {
		super();
	}
	
	@Parameters({"Browser","url"})
	@BeforeMethod
	public void setUp(String Browser,String url)
	{
		initialization(Browser, url);
		Log.info("Application Launched Successfully");
		 searchpage=new Tripa_SeachPage();
	}
/*	
	@Test(priority=1)
	public void homePageTitle_Test() {
		String title=searchpage.verifyHomePageTitle();
		Assert.assertEquals(title, "TripAdvisor Official Site‎");
		Log.info("HomePage Title verified successfully");
	}
	
	@Test(priority=2)
	public void homepageImage_Test() {
		boolean flag=searchpage.verifyLogo();
		Assert.assertTrue(flag);
		Log.info("HomePage image verified successfully");
	}*/
	
	@Test(priority=3)
	public void search_Test() {
		searchpage.search();
	}
	
}
