package com.kartik.Ex005Action_Advance;

import io.qameta.allure.Description;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Action_Scrolling {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
    }

    @Description("Verify the Scrolling")
    @Test
    public void test_action() throws InterruptedException {
        driver.get("https://thetestingacademy.com/");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        System.out.println("Scrolled Down");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
