package com.kartik.JS_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

    import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class jsalert {
        public static void main(String[] args) throws InterruptedException {
            // Set up WebDriver
            WebDriver driver = new ChromeDriver();

            // Open a webpage with an alert
            driver.get("https://example.com");  // Replace with actual page URL

            // Trigger an alert using JavaScript
            ((JavascriptExecutor) driver).executeScript("alert('This is a test alert!');");

            // Switch to alert
            Alert alert = driver.switchTo().alert();

            // Get alert text
            System.out.println("Alert Message: " + alert.getText());

            // Accept (OK) the alert
            alert.accept();

   Thread.sleep(5000);
            // Close the browser
            driver.quit();
        }
    }
















