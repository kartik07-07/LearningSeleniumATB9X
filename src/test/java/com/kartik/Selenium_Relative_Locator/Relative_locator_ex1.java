//package com.kartik.Selenium_Relative_Locator;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.PageLoadStrategy;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
//
//import static org.openqa.selenium.support.locators.RelativeLocator.with;
//
//public class Relative_locator_ex1 {
//    EdgeDriver driver;
//
//    public void testMethod() throws Exception {
//        EdgeOptions options = new EdgeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        options.addArguments("--start-maximized");
//
//        driver = new EdgeDriver(options);
//        String URL = "https://awesomeqa.com/practice.html";
//        driver.get(URL);
//        driver.manage().window().maximize();
//
//        //toRightof
//        //LeftOf
//        //Above
//        //below
//        //near
//
//
//        //span[normalize-space()='Years of Experience']
//
//        WebElement span_element = driver.findElement(By.xpath("//span[normalize-space()='Years of Experience']"));
//
//        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();
//
//        Thread.sleep(500);
//        driver.quit();
//
//
//
//    }
//}


package com.kartik.Selenium_Relative_Locator;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Relative_locator_ex1 {
    EdgeDriver driver;

    public void testMethod() throws Exception {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        driver = new EdgeDriver(options);
        driver.get("https://awesomeqa.com/practice.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait for element to be visible
        WebElement span_element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Years of Experience']")));

        // Click checkbox using relative locator
        driver.findElement(with(By.id("exp-2")).toRightOf(span_element)).click();

        Thread.sleep(1000);
        driver.quit();
    }
    public static void main(String[] args) {
        try {
            Relative_locator_ex1 obj = new Relative_locator_ex1();
            obj.testMethod(); // Calling the test method
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

