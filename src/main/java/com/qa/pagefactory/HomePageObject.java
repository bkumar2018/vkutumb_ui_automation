package com.qa.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageObject {

	@FindBy(xpath = "//a[@href='/home']")
	public WebElement home;

	@FindBy(xpath = "//a[@href='/user/dashboard']")
	public WebElement book;

	@FindBy(xpath = "//a[@href='/pricing']")
	public WebElement pricing;

	@FindBy(xpath = "//a[@href='/aboutus']")
	public WebElement aboutus;

	@FindBy(xpath = "//a[@href='/contactus']")
	public WebElement contactus;

	@FindBy(xpath = "//a[@href='/blogs']")
	public WebElement blogs;

	@FindBy(xpath = "//a[@href='/login']")
	public WebElement login;

	@FindBy(xpath = "//a[@href='/signup']")
	public WebElement signup;

	@FindBy(xpath = "//ul[contains(@class,'chakra-stack nav-left')]//a")
	public List<WebElement> homeTabs;

	public HomePageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
