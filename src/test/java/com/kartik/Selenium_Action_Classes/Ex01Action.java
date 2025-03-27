package com.kartik.Selenium_Action_Classes;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex01Action {

    EdgeDriver driver;


    @BeforeTest

    public void openBrowser(){
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        driver = new EdgeDriver(edgeOptions);
    }


    @Description
    @Test
    public  void test_action(){
        String URL = "https://awesomeqa.com/practice.html";

        driver.get(URL);
        driver.manage().window().maximize();

        WebElement firtsName = driver.findElement(By.name("firstname"));
        Actions actions = new Actions(driver);



        actions .keyDown(Keys.SHIFT).sendKeys(firtsName,"the testing academy").keyUp(Keys.SHIFT).build().perform();
    }


    @AfterTest
    public  void closeBrowser(){
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);

        }
        driver.quit();



    }


}
