package com.ucsc.automationcc.tests;

import com.ucsc.automationcc.pages.PageHome;
import com.ucsc.automationcc.pages.PageLogin;
import com.ucsc.automationcc.utils.TestNGUtil;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Authentication extends TestNGUtil {

    @Test
    public void login(){
        PageHome pageHome = new PageHome(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageHome);
        PageLogin pageLogin = pageHome.clickOnLoginSign();
        pageLogin.enterEmail("sanathkaushalya@gmail.com");
        pageLogin.enterPassword("12345678");
        pageLogin.clickOnLogInButton();
    }
}
