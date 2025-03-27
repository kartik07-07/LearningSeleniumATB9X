package com.kartik.Selenium_1_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Example2 {


    @Description
    @Test
    public void webdriverex(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--incognito");
        edgeOptions.addArguments("--Start-maximum");

        EdgeDriver driver = new EdgeDriver();
        driver.get("http://app.vwo.com");



    }



}

