package com.ucsc.automationcc.utils;

import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;

public class CapabilityOption {

    public UiAutomator2Options getAndroidCapability(){
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setPlatformVersion("14.0");
        uiAutomator2Options.setAutomationName("UIAutomator2");
        uiAutomator2Options.setDeviceName("emulator-5554");
        uiAutomator2Options.setAppPackage("com.wdiodemoapp");
        uiAutomator2Options.setAppActivity(".MainActivity");
        File apkFile = new File(getClass().getClassLoader().getResource("android.wdio.native.app.v1.0.8.apk").getFile());
        uiAutomator2Options.setApp(apkFile.getAbsolutePath());
        return uiAutomator2Options;
    }
}
