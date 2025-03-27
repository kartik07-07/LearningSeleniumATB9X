//package com.kartik.Selenium_shadom;
//
//import io.qameta.allure.Description;
//import org.openqa.selenium.*;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.Test;
//
//public class Shadom_js {
//    EdgeDriver driver;
//
//    @Description("verify the js")
//    @Test
//            public void test_js(){
//
//        driver.manage().window().maximize();
//
//        String URL="https://www.flipkart.com/";
//        driver.get(URL);
//        driver.manage().window().maximize();
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//
//
//        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@class=\"_1UgUYI _2eN8ye\"]"));
//        js.executeScript("arguments[0].scrolllntoView(true);",div_to_scroll );
//
//    }
//}
package com.kartik.Selenium_shadom;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Shadom_js {
    EdgeDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize the EdgeDriver
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Description("Verify JavaScript execution")
    @Test
    public void test_js() {
        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        try {
            // Handle Flipkart login pop-up if present
            WebElement closeLoginPopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            closeLoginPopup.click();
        } catch (NoSuchElementException e) {
            System.out.println("No login popup displayed.");
        }

        try {
            WebElement div_to_scroll = driver.findElement(By.xpath("//input[@id='kils']"));
            js.executeScript("arguments[0].scrollIntoView(true);", div_to_scroll);
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
