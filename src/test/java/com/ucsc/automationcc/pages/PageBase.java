package com.ucsc.automationcc.pages;

import io.appium.java_client.AppiumDriver;

public class PageBase {

    AppiumDriver driver;

    public PageBase(AppiumDriver driver){
        this.driver = driver;
    }
}
