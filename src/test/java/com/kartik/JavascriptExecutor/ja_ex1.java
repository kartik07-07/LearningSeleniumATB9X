package com.kartik.JavascriptExecutor;

import io.qameta.allure.Description;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ja_ex1 {
    EdgeDriver driver;

    @BeforeTest

    public  void openBrowser(){
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
         driver = new EdgeDriver();
    }
    @Description("verify the page is scroll")
    @Test
    public void test_page_scroll()throws  Exception{

        driver.manage().window().maximize();
        String URL="https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500);");  // Corrected from `windows.scrollBy`

        // Adding a short delay to observe the scroll action
        Thread.sleep(2000);
        driver.quit();
    }


    }

