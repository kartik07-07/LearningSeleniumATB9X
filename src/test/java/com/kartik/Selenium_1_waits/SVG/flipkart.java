package com.kartik.Selenium_1_waits.SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;


public class flipkart {
    ChromeDriver driver;



@BeforeTest
public void  optionbrowser(){
    ChromeOptions options = new ChromeOptions();
    options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    options.addArguments("--guest");
   driver = new ChromeDriver(options);
}


    @Description("verify that after search, results are visible ")
    @Test
    public void test_flipkart_search() {

    ChromeDriver driver = new ChromeDriver();
     driver.manage().window().fullscreen();
     String URL = "https://www.flipkart.com/";
     driver.get(URL);
        driver.manage().window().fullscreen();

        driver.findElement(By.name("q")).sendKeys("macmini");
        List<WebElement> svgelements= driver.findElements(By.xpath("//*[name()=\"svg\"]"));
        svgelements.get(0).click();

//        List<WebElement> titleResult = driver.findElements(By.xpath("//div[contains@data-id,'CPU')]/div/a[2]"));
//
//        for (WebElement title : titleResult){
//
//         System.out.println(title.getText());          ( this is for the elements , inside onces)
//
//        }
    }

    @AfterTest
    public void closebrowser(){

    try{
        Thread.sleep(3000);

    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.quit();

    }
}
