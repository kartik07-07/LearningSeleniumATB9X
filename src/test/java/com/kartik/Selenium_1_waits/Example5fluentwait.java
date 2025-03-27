//package com.kartik.Selenium_waits;
//
//import io.qameta.allure.Description;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//import org.testng.Assert;
//
//import java.time.Duration;
//import java.util.function.Function;
//
//
//public class Example5fluentwait {
//
// @Description("verify that with invaild email,pass, error message is shown on the app.vwo.com")
//    public void fluent(){
//
//
//        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2).ignoring(NoSuchFieldException.class));
//
//
//        WebElement error_message = wait.until(new Function<WebDriver, WebElement>(){
//            public WebElement apply(WebDriver driver){
//                return driver.findElement(By.className("notification-box-description"));
//            }
//
//        });
//
//
//        Assert.assertEquals(error_message.getText(),"your email, password,IP address or");
//
//
//        driver.quit();
//
//    }
//
//
//}
