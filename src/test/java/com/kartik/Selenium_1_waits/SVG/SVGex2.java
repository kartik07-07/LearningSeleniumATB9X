package com.kartik.Selenium_1_waits.SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SVGex2 {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions .addArguments("--guest");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);
    }


    @Description("verify that after search result is verify")
    @Test
    public void flipkart_search(){

     driver.manage().window().maximize();
     String URL = " https:/www.flipkart.com/";
     driver.get(URL);
     driver.manage().window().maximize();


     driver.findElement(By.xpath("/*[local-class='Pke_EE']")).sendKeys("mackbook");



    }


    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(3000);

        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
