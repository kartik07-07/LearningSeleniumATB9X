package com.kartik.selenium_locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PROJECT2 {
    @Description("verify the URL")
    @Test
    public  void test_makeappointment_katalon() throws  Exception{


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--windows-size-maximum");


        WebDriver driver =  new ChromeDriver(chromeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");




        //Make Appointment
        //<a
        // id="btn-make-appointment"
        // href="./profile.php#login"
        // class="btn btn-dark btn-lg">Make Appointment</a>



        WebElement makeappointment = driver.findElement(By.id("btn-make-appointment"));
        makeappointment.click();




        //username
        //<input type="text" class="form-control" id="txt-username" name="username" placeholder="Username" value="" autocomplete="off">

         WebElement username = driver.findElement(By.id("txt-username"));
         username.sendKeys("John Doe");

        //password
        //<input type="password" class="form-control" id="txt-password" name="password" placeholder="Password" value="" autocomplete="off">
         WebElement password = driver.findElement(By.id("txt-password"));
         password.sendKeys("ThisIsNotAPassword");


         //Login_Button
        //<button id="btn-login" type="submit" class="btn btn-default" fdprocessedid="q1ezc">Login</button>

        WebElement Login_Button = driver.findElement(By.id("btn-login"));
        Login_Button.click();



        Thread.sleep(3000);
        //Verify the URL
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");




        Thread.sleep(5000);
       // driver.quit();

    }

}
