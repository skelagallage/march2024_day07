package com.ucsc.automationcc.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageHome extends PageBase{

    @AndroidFindBy(accessibility = "Login")
    public WebElement loginSign;

    public PageHome(AppiumDriver driver) {
        super(driver);
    }

    public PageLogin clickOnLoginSign(){
        loginSign.click();
        PageLogin pageLogin = new PageLogin(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageLogin);
        return pageLogin;
    }
}
