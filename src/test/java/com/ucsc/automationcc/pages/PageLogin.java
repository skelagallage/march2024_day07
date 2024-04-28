package com.ucsc.automationcc.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class PageLogin extends PageBase{

    @AndroidFindBy(accessibility = "input-email")
    @iOSXCUITFindBy(accessibility = "input-email")
    public WebElement email;

    @AndroidFindBy(accessibility = "input-password")
    @iOSXCUITFindBy(accessibility = "input-password")
    public WebElement password;

    @AndroidFindBy(accessibility = "button-LOGIN")
    @iOSXCUITFindBy(accessibility = "button-LOGIN")
    public WebElement loginButton;
    public PageLogin(AppiumDriver driver) {
        super(driver);
    }

    public void enterEmail(String emailStr){
        email.sendKeys(emailStr);
    }

    public void enterPassword(String passwordStr){
        password.sendKeys(passwordStr);
    }

    public void clickOnLogInButton(){
        loginButton.click();
    }
}
