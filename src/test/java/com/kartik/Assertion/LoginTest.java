package com.kartik.Assertion;

    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

    public class LoginTest {
        WebDriver driver;

        @BeforeClass
        public void setUp() {
            // Set up ChromeDriver
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.orangehrm.com/login"); // Open login page
        }

        @Test
        public void testLogin() {
            // Find and fill username field
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("Admin");

            // Find and fill password field
            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("admin123");

            // Click Login button
            WebElement loginButton = driver.findElement(By.id("loginButton"));
            loginButton.click();

            // ✅ Assertion 1: Check if the login was successful
            String expectedMessage = "Welcome, Test User!";
            String actualMessage = driver.findElement(By.id("welcomeMessage")).getText();
            Assert.assertEquals(actualMessage, expectedMessage, "Login message mismatch!");

            // ✅ Assertion 2: Verify Logout button is displayed
            WebElement logoutButton = driver.findElement(By.id("logout"));
            Assert.assertTrue(logoutButton.isDisplayed(), "Logout button is not visible!");
        }

        @AfterClass
        public void tearDown() {
            driver.quit(); // Close browser
        }
    }









