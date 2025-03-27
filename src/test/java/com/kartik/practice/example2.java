package com.kartik.practice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class example2 {  // Class name should start with an uppercase letter
    ChromeOptions options;  // Variable name should be lowercase
    WebDriver driver;

    @BeforeTest
    public void setup() {
        options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Corrected argument
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
    }

    @Test
    @Description("Verify that with a valid username and valid password, login is successful!")
    public void testValidLogin() throws InterruptedException {
        driver.get("https://app.vwo.com/#/login");

        driver.findElement(By.id("login-username")).sendKeys("93npu2yyb0@esiix.com");
        driver.findElement(By.id("login-password")).sendKeys("wingify@123");
        driver.findElement(By.id("js-login-btn")).click();
        Thread.sleep(5000);

        // Ensure the selector is correct
        Assert.assertTrue(driver.findElement(By.cssSelector(".page-heading")).isDisplayed(),
                "Login was not successful, page-heading not found.");
    }

    @AfterTest  // Changed from @AfterSuite to @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
