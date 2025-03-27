package com.kartik.following_and_preceding;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;

public class SiblingXPathExample {

    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testSiblingXPath() {
        // Open the login page
        driver.get("https://example.com/login");  // Replace with the actual URL

        // 1️⃣ Find the password field using `following-sibling` from username field
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='username']/following-sibling::input"));
        passwordField.sendKeys("MySecurePassword");

        // 2️⃣ Find the username field using `preceding-sibling` from password field
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='password']/preceding-sibling::input"));
        usernameField.sendKeys("MyUsername");

        // 3️⃣ Find the login button using `following-sibling` from password field
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='password']/following-sibling::button"));
        loginButton.click();
    }

    @AfterTest
    public void closeBrowser() {
        if (driver != null) {
            try {
                Thread.sleep(3000);  // Wait before closing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}

