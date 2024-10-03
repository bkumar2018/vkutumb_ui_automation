package com.qa.testcases;

import com.qa.scripts.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.scripts.HomePage;

//1. Test to verify UI Connectivity
public class TC_002 extends BaseClass {

    @Test
    public void verifyAllTabs() {
        HomePage homePage = new HomePage(driver);
        homePage.getAllTabs();
        Assert.assertTrue(homePage.checkAllTabs(), "All tabs on Homepage not found.");
        //Assert.assertEquals(homePage.getHomePageUrl(), "https://vkutumb.com/", "URL is not correct");
        //Assert.assertEquals(homePage.getTitle(), "vKutumb", "Title is not correct");
    }

}

