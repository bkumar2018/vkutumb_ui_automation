package com.qa.scripts;

import org.openqa.selenium.WebDriver;

import com.qa.pagefactory.HomePageObject;
import com.qa.utils.WaitExecuter;
import org.testng.Assert;

public class HomePage {
	
	private WebDriver driver;
	private HomePageObject homePageObject;
	private WaitExecuter waitExecuter;
	  
	public HomePage(WebDriver driver){
		this.driver = driver;
		homePageObject = new HomePageObject(driver);
		waitExecuter = new WaitExecuter(driver);
	}
	
	public String getHomePageUrl(){
		return driver.getCurrentUrl();
	}

	public String getTitle(){
		return driver.getTitle();
	}

	public void gotoHomePage(String homePageUrl){
		driver.get(homePageUrl);
	}

	public void clickOnSignUpBtn(){
		homePageObject.signup.isDisplayed();
		homePageObject.signup.isEnabled();
		homePageObject.signup.click();
	}


	public boolean checkAllTabs(){

		Assert.assertTrue(homePageObject.book.isDisplayed());
		Assert.assertTrue(homePageObject.pricing.isDisplayed());
		Assert.assertTrue(homePageObject.aboutus.isDisplayed());
		Assert.assertTrue(homePageObject.contactus.isDisplayed());
		Assert.assertTrue(homePageObject.blogs.isDisplayed());
		return true;
	}
}
