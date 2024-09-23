package com.qa.scripts;

import com.qa.pagefactory.HomePageObject;
import com.qa.pagefactory.SignUpPageObject;
import com.qa.utils.WaitExecuter;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    private WebDriver driver;
    private SignUpPageObject signupPageObject;
    private WaitExecuter waitExecuter;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        signupPageObject = new SignUpPageObject(driver);
        waitExecuter = new WaitExecuter(driver);
    }

    public void registerAccount(){
        signupPageObject.name.sendKeys("Birender Kumar");
        signupPageObject.email.sendKeys("birender.cdac@gmail.com");
        signupPageObject.password.sendKeys("Vtemp123#");

        waitExecuter.waitUntilElementPresent(signupPageObject.recaptcha_checkbox);
        waitExecuter.waitUntilElementClickable(signupPageObject.recaptcha_checkbox);

        if(signupPageObject.recaptcha_checkbox.isDisplayed()) {
            signupPageObject.recaptcha_checkbox.isEnabled();
            signupPageObject.recaptcha_checkbox.click();
            signupPageObject.sign_up_btn.isDisplayed();
            signupPageObject.sign_up_btn.isEnabled();
            signupPageObject.sign_up_btn.click();
        }
    }


}