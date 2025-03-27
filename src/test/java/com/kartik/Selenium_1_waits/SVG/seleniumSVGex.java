package com.kartik.Selenium_1_waits.SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class seleniumSVGex {

    @Description("Test case Description")
    @Test
    public void SVG_image() throws Exception{

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();


        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));
   for(WebElement state: states){
       System.out.println(state.getDomAttribute("aria-label"));
       if(state.getAttribute("aria-label").contains("Tripura")) {
       state.click();
       }
       }


        Thread.sleep(5000);
        driver.quit();


    }

}
