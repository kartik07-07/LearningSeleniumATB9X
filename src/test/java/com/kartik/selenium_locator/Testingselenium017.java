package com.kartik.selenium_locator;

import java.util.List;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testingselenium017 {

        @Description("test the URL")
        @Test
        public void test_negativetestcase_vwo() throws  Exception{


            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--windows-size=500,500");


            WebDriver driver = new EdgeDriver(edgeOptions);
            driver.get("https://vwo.com/free-trial");

          //<input class="W(100%) Py(14px)
            // input-text invalid-input"
            // placeholder="name@yourcompany.com"
            // type="email" id="page-v1-step1-email"
            // name="email" data-qa="page-su-step1-v1-email"
            // required="" fdprocessedid="0gz5e9"
            // data-gtm-form-interact-field-id="0">



            WebElement email = driver.findElement(By.id("page-v1-step1-email"));

             email.sendKeys("Kartik@987547");




             // checkbox
            //<input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
            // type="checkbox" name="gdpr_consent_checkbox"
            // id="page-729cu-gdpr-consent-checkbox"
            // value="true" data-qa="page-gdpr-consent-checkbox" data-gtm-form-interact-field-id="1">


            WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
             checkbox.click();






             // clickbutton
           // <button type="submit"
            // class="button W(100%) btn-modal-form-submit"
            // data-qa="page-su-submit" fdprocessedid="b2ca5e"
            // value="">Create a Free Trial Account</button>



         //   <button type="submit" class="button W(100%)
            //   btn-modal-form-submit" data-qa="page-su-submit"
            //   fdprocessedid="b2ca5e"
            //   value="">Create a Free Trial Account</button>



            List<WebElement> buttonList = driver.findElements(By.tagName("button")); // tagname is for reference dont use it

            buttonList.get(0).click();

             //Notification

           // <div
            // class="C($color-red) Fz($font-size-12) Trsp($Op)
            // Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">The email address you entered is incorrect.
            // </div>
            WebElement notification_bar= driver.findElement(By.className("invalid-reason"));
            Assert.assertEquals(notification_bar.getText(), "The email address you entered is incorrect.");






            Thread.sleep(10000);
            driver.quit();


        }
    }


// Preference Rule
//unique ID -> name ->classs Name -> TagName -> linkText/ Partial(a tag)->Css selector


