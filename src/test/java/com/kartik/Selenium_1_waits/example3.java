package com.kartik.Selenium_1_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class example3 {

    @Description
    @Test
    public void example3(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("incognito");
        edgeOptions.addArguments("--start-maximum");


    WebDriver driver = new EdgeDriver(edgeOptions);
    driver.navigate().to("https://app.vwo.com");
    System.out.println(driver.getTitle());


        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");


        // 1. Find the email inputbox and enter the email
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");


        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("password@321");


        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();



        WebElement error_message =driver.findElement(By.id("js-notification-box-msg"));



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(error_message));
     //   wait.until(ExpectedConditions.elementToBeClickable())



        wait.until(ExpectedConditions.textToBePresentInElement(error_message,"Your email, password, IP address or location did not match"));


      Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");


      driver.quit();
    }




}