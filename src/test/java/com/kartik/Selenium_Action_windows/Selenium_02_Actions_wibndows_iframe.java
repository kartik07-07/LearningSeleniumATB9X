package com.kartik.Selenium_Action_windows;

import com.beust.ah.A;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Selenium_02_Actions_wibndows_iframe {
    EdgeDriver driver;
    EdgeDriver wait;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait
//                .until(
//                        ExpectedConditions.
//                                visibilityOfElementLocated(
//                                        By.xpath(""
//                                        )
//                                )
//                );


    }

    @Description("")
    @Test
    public void test_the_windows() {

        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();
//        Thread.sleep(5000);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        String parentwindowsHandle = driver.getWindowHandle();
        System.out.println("Parent Windows" + parentwindowsHandle);


        List<WebElement> list_heatmaps = driver.findElements(By.cssSelector("[data-qa=\"yedexafobi\"]"));


        Actions actions = new Actions(driver);
        actions.moveToElement(list_heatmaps.get(1)).click().build().perform();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Set<String> allhandles = driver.getWindowHandles();
        System.out.println("All windows handles" + allhandles);

        for (String handle : allhandles) {
            if (!handle.equals(parentwindowsHandle)) {
                driver.switchTo().window(handle);
                System.out.println("Child Window Title: " + driver.getTitle());
                driver.switchTo().frame("heatmap-iframe");
                WebElement clickmap = driver.findElement(By.cssSelector("[data-qa='liqokuxuba']"));
                clickmap.click();
            }
        }
        driver.quit();
    }}