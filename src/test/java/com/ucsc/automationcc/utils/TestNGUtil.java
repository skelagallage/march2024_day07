package com.ucsc.automationcc.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;

public class TestNGUtil {

    protected static AppiumDriver driver;

    @BeforeTest
    public void initApp(){
        CapabilityOption capabilityOption = new CapabilityOption();
        driver = new AndroidDriver(capabilityOption.getAndroidCapability());
    }
}
