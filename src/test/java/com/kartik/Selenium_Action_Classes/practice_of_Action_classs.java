package com.kartik.Selenium_Action_Classes;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNGException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class practice_of_Action_classs {
    ChromeDriver driver;

    @BeforeTest
    public void openbrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
     driver = new ChromeDriver(options);
    }

    @Description("verify the website")
    @Test
    public  void test_the_site(){


        driver.manage().window().fullscreen();
        String URL = "https://www.makemytrip.com/";
        driver.get(URL);
        driver.manage().window().fullscreen();



        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));




       driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
       WebElement fromCity = driver.findElement(By.id("fromCity"));


        try{
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Actions actions = new Actions(driver);
        actions.moveToElement(fromCity).click().sendKeys("New Delhi").build().perform();

       actions.moveToElement(fromCity).contextClick();

//        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
//
//        for(WebElement e : list_auto_complete){
//            if(e.getText().contains("New Delhi")){
//                e.click();
//                break;
//            }
//        }

        try{
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



        actions.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();


 }

    @AfterTest
    public  void closebrowser(){

        try{
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }

}
