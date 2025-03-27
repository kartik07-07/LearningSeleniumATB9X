package com.kartik.Selenium_shadom;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class example2_shadom_js {
    ChromeDriver driver;

    @BeforeTest
    public void setUp() throws Exception{
        driver = new ChromeDriver();
    }


    @Description("verify the js")
    @Test
    public  void test_js(){


        driver.manage().window().maximize();
        String URL ="https://www.amazon.in/";
        driver.get(URL);


        JavascriptExecutor js = (JavascriptExecutor)driver;



        WebElement amazon = driver.findElement(By.xpath("//div[@class='navFooterColHead']"));
        js.executeScript("arguments[0].scrolllntoView(true);",amazon);

        //Thread.sleep(3000);
        try{
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }


    }

}
