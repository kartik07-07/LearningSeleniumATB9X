package com.kartik.EX004Selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Testselenium015 {
    @Description("test the URL")
    @Test
    public void test_selenium15() throws  Exception{


        ChromeOptions chromeOptions = new ChromeOptions();


        chromeOptions.addArguments("--windows-size=500,500");


        WebDriver driver = new ChromeDriver();
        driver.get("https:/google.com");

    }
}
