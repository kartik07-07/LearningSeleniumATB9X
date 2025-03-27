//package com.kartik.Selenium_Action_Classes;
//
//import io.qameta.allure.Description;
//import org.openqa.selenium.By;
//import org.openqa.selenium.PageLoadStrategy;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.util.Set;
//
//public class Action_windows {
//
//    ChromeDriver driver;
//
//    @BeforeTest
//    public void openbrowser() {
//        ChromeOptions options = new ChromeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        options.addArguments("--guest");
//        driver = new ChromeDriver(options);
//
//
////        try {
////            Thread.sleep(2000);
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////
////        }
//    }
//
//    @Description("verify the test")
//    @Test
//    public void test_action_windows() throws InterruptedException {
//
//        driver.manage().window().fullscreen();
//        String URL = "https://the-internet.herokuapp.com/windows";
//        driver.get(URL);
//        driver.manage().window().fullscreen();
//
//
//        String parenth_Window = driver.getWindowHandle();
//        System.out.println("Parent windows handle:" + parenth_Window);
//
////      driver.findElements(By.linkText("click Here")).click();
//        driver.findElement(By.linkText("Click Here"));
//        clickHereLink.click();
//
//        Set<String> WindowHandles = driver.getWindowHandles();
//        System.out.println("Window Handles:" + WindowHandles);
//
//
//
//
//        for(String Handle:WindowHandles){
//            if (!handle.equals(parent_Window)) {
//            driver.switchTo().window(handle);
//            if(driver.getPageSource().contains("New Window")){
//                System.out.println("Testcase Passed!!");
//                break;
//
//        }
//        }
//
//}
//@AfterTest
//public  void closeBrowser() {
//    try {
//        Thread.sleep(3000);
//    } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//
//    }
//    driver.quit();
//
//}
//
//
//}
package com.kartik.Selenium_Action_Classes;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class Action_windows {

    ChromeDriver driver;

    @BeforeTest
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new ChromeDriver(options);
    }

    @Description("Verify the test")
    @Test
    public void testActionWindows() throws InterruptedException {
        driver.manage().window().maximize();
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window handle: " + parentWindow);

        // Corrected to locate the element and click it
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println("Window Handles: " + windowHandles);

        for (String handle : windowHandles) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
                if (driver.getPageSource().contains("New Window")) {
                    System.out.println("Test case Passed!!");
                }
                driver.close(); // Close the new window
                break;
            }
        }
        driver.switchTo().window(parentWindow); // Switch back to parent window
    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
