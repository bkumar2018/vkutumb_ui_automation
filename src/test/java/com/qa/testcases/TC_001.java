package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.BaseClass;
import com.qa.scripts.HomePage;

//1. Test to verify UI Connectivity
public class TC_001 extends BaseClass {

    @Test
    public void checkvKutumbConnectivity() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getHomePageUrl(), "https://vkutumb.com/", "URL is not correct");
        Assert.assertEquals(homePage.getTitle(), "vKutumb", "Title is not correct");
    }

}
