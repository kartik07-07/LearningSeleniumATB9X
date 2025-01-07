package com.kartik.Ex003Selenium;

import io.qameta.allure.Description;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

public class TestSelenium10 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        //
//        WebDriver driver = new EdgeDriver();
//        driver.get("https://katalon-demo-cura.herokuapp.com/");
//        driver.manage().window().maximize();
//
//        if (driver.getPageSource().contains("CURA Healthcare Service")) {
//            System.out.println("CURA Healthcare Service is visible!");
//            Assert.assertTrue(true);
//        } else {
//            throw new Exception("CURA Healthcare Service is Not visible.");
//        }
     WebDriver driver = new EdgeDriver();
     driver.get("https://ketalon-demo-cura.herokuapp.com/");

     driver.manage().window().maximize();

     if(driver.getPageSource().contains("CURA Healthcare service")){

         System.out.println(true);
     }else{
         throw new Exception("CURA Healthcare service");
     }

    }

}
