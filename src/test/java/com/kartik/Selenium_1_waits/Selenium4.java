package com.kartik.Selenium_1_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium4 {
    @Description("verify makemytrip")
    @Test
    public void testmakemytrip(){


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start-maxmized");


        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("http:/www.makemytrip.com/");
        System.out.println(driver.getTitle());



        //condition
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));
       // wait.until(ExpectedConditions.textToBePresentInElement(error_message,"your eamil,password, IP address or Location did not match"));

        WebElement closeModal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        closeModal.click();

       try{
           Thread.sleep(10000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

      //  Assert.assertEquals(error_message.getText(),"your eamil,password, IP address or Location did not match");


        driver.quit();
    }



}
