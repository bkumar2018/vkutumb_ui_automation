package com.qa.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.pagefactory.HomePageObject;
import com.qa.utils.WaitExecuter;

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
}
