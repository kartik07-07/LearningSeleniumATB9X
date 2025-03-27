package com.kartik.Selenium_Action_windows;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.PublicKey;
import java.util.Set;

public class Action_windows_ex1 {
    EdgeDriver driver;

    @BeforeTest
    public void openbrowser(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--guest");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);

    }

    @Description("verify the windows")
    @Test
    public  void test_windows(){

        driver.manage().window().maximize();
        String URL="https://the-internet.herokuapp.com/windows";
        driver.get(URL);

        // To handle the windows we use
        String parentwindows = driver.getWindowHandle();
        System.out.println("Parent Windows Handle " +parentwindows);

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        driver.findElement(By.linkText("Click Here")).click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Windows Handle" + windowHandles);

        for(String handle:windowHandles){
            driver.switchTo().window(handle);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test case passed");
                break;
            }
        }



    }

    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
