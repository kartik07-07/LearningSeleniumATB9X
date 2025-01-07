package com.kartik.EX004Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.security.PublicKey;

public class Testselenium016Proxy {

    @Description(" Test the case")
    @Test
    public void test_selenium16() throws  Exception{


        EdgeOptions edgeOptions  = new EdgeOptions();
        edgeOptions.addArguments("--Windows-size=500,700");


        edgeOptions.addExtensions(new File("src/test/java/com/kartik/EX004Selenium/AdBlock.crx"));

//        Proxy proxy = new Proxy();
//
//        proxy.setHttpProxy("");


        WebDriver webDriver =new EdgeDriver(edgeOptions);
        webDriver.get("https://www.youtube.com/shorts/HAMhpnlmWVc");





    }


}
