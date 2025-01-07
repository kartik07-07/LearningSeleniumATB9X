package com.kartik.selenium_locator;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Testselenium016 {
    @Description("test the URL")
    @Test
    public void test_negativetestcase_vwo() throws  Exception{


        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--windows-size=500,500");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https:/app.vwo.com");
        //1. find the emial inputbox and enter the eamil

       // <input  -->open HTML Tag
        // type="email" --> key == value (attributes) attributes-->it recognise you
        // class="text-input W(100%)"
        // name="username" id="login-username"
        // data-qa="hocewoqisi" fdprocessedid="3ytxar">

          WebElement emailInputBox = driver.findElement(By.id("login-username"));
          emailInputBox.sendKeys("admin@admin.com");

        // 2. Find the  password inputbox and enter the passwords

        //<input type="password"
// class="text-input W(100%)"
// name="password"
// id="login-password"
// data-qa="jobodapuxe"
// fdprocessedid="zfj4ue">

        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("admion@1234");




        //3. find the submit button and click on it.


//<button type="submit"
// id="js-login-btn"
// class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
// onclick="login.login(event)"
// data-qa="sibequkica" fdprocessedid="pevofm">

WebElement buttonclick = driver.findElement(By.id("js-login-btn"));
        buttonclick.click();


        Thread.sleep(5000);



        //4. Find the invalid error msg and verify
      //  <div class="notification-box-description"
        //  id="js-notification-box-msg"
        //  data-qa="rixawilomi">Your email, password, IP address or location did not match
        //  </div>


WebElement notification = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(notification.getText(),"Your email, password, IP address or location did not match");



        /// link part = link match
     //   <a href="https://vwo.com/free-trial/?utm_medium=website&amp;
        //   utm_source=login-page&amp;
        //   utm_campaign=mof_eg_loginpage"
        //   class="text-link" data-qa="bericafeqo">Start a free trial</a>

Thread.sleep(4000);
//        WebElement _tag_free_trial = driver.findElement(By.linkText("Start a free trial"));
//        _tag_free_trial.click();

// imp linktext is only use for a tag


        //partial_match
        WebElement _tag_free_trial_partial = driver.findElement(By.partialLinkText("free trial"));
        _tag_free_trial_partial.click();

        //match with
//Start a free trail
        // a free trail
        // free trail
        // trail
        //start





// Sign up data
        //<input class="W(100%) Py(14px)
        // input-text" placeholder="name@yourcompany.com"
        // type="email" id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email"
        // required="" fdprocessedid="pcenbg">


 WebElement sign_up = driver.findElement(By.name("email" ));
 sign_up.sendKeys("kartik@gmail.com");



// // Checkbox
//        //<label for="page-729cu-gdpr-consent-checkbox"
//        // class="Ta(start) Cur(p) Fz($font-size-12) Mstart(10px) Us(n)">
//        //        I agree to VWO's <a class="C($color-blue) white_C($color-white)"
//        //        href="https://vwo.com/privacy-policy/"
//        //        target="_blank">Privacy Policy</a> &amp;
//        //        <a href="https://vwo.com/terms/" class="C($color-blue)
//        //        white_C($color-white)" target="_blank">Terms</a>
//        //        </label>
//
//WebElement checkbox = driver.findElement(By.className("Ta(start) Cur(p) Fz($font-size-12) Mstart(10px) Us(n)"));
//checkbox.click();


        //creat a free trail
        //<button type="submit"
        // class="button W(100%) btn-modal-form-submit button--disabled-primary"
        // data-qa="page-su-submit"
        // fdprocessedid="b2ca5e"
        // value="" disabled="disabled">Create a Free Trial Account</button>

        WebElement create_free_trial = driver.findElement(By.className("button W(100%) btn-modal-form-submit button--disabled-primary" ));
create_free_trial.click();



// Notification
       // <div class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
        //The email address you entered is incorrect.</div>
        WebElement notification1 = driver.findElement(By.className("C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason"));
      Assert.assertEquals(notification.getText(),"The email address you entered is incorrect");

































        Thread.sleep(15000);
        driver.quit();


    }
}


// Preference Rule
//unique ID -> name ->classs Name -> TagName -> linkText/ Partial(a tag)->Css selector