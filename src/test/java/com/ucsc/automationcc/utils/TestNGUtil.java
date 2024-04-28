package com.ucsc.automationcc.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.testng.annotations.BeforeTest;

public class TestNGUtil {

    protected static AppiumDriver driver;

    private String os = "ios";// android

    @BeforeTest
    public void initApp(){
        CapabilityOption capabilityOption = new CapabilityOption();
        if(os.equalsIgnoreCase("ios")){
            driver= new IOSDriver(capabilityOption.getIosCapability());
        } else if (os.equalsIgnoreCase("android")) {
            driver= new AndroidDriver(capabilityOption.getAndroidCapability());
        }
    }
}
