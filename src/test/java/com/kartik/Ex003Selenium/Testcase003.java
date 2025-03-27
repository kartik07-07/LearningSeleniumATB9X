package com.kartik.Ex003Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

//import io.qameta.allure.Description;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.safari.SafariOptions;
//import org.testng.annotations.Test;



import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

//public class Testcase003 {
//    @Description("Open the  app.vwo.com")
//    @Test
//    public void test_selenium() throws Exception{
//
//        EdgeOptions edgeOptions = new EdgeOptions();
////       (class)      reference       object
//
//        edgeOptions.addArguments("--maximum");
//
//        WebDriver driver = new EdgeDriver();
////        System.out.println(driver.getTitle());
//        driver.get("https://google.com");
//
//    }
//}


public class Testcase003{
    @Description("Open the app.VWo.com")
    @Test
    public void test_selenium() throws Exception{
        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addArguments("--Maximum");
        WebDriver driver = new EdgeDriver();
        System.out.println(driver.getTitle());
        driver.get("https://google.com");

    }

}