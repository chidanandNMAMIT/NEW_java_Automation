package com.tripa.qa.pages.Pages;

import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tripa.qa.BaseClass.TestBase;
import com.tripa.qa.Utilities.TestUtility;

public class Tripa_SeachPage extends TestBase {

	@FindBy(xpath = "//a[@class='brand-header-Logo__logo--x3aMw']//img")
	WebElement Logo;

	@FindBy(xpath = "//div[@title='Search']")
	WebElement Search_Btn;

	@FindBy(xpath = "//form[@id='global_nav_search_form']//input[@id='mainSearch']")
	WebElement Search_Send;

	@FindBy(xpath = "//a[text()='Write a review']")
	WebElement Write_Review;

	public Tripa_SeachPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}

	public boolean verifyLogo() {
		return Logo.isDisplayed();
	}
	
	public void search() {
		TestUtility.sendKeys(driver, Search_Send, 10, "Club mahindra");
		TestUtility.robot.keyPress(KeyEvent.VK_DOWN);
		TestUtility.robot.keyPress(KeyEvent.VK_ENTER);
		TestUtility.scrollSpecificElement(driver, Write_Review);
		Write_Review.click();	
	}

}
