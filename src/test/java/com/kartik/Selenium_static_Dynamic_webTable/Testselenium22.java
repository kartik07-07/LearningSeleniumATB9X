package com.kartik.Selenium_static_Dynamic_webTable;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


import java.io.FilterOutputStream;
import java.util.List;

public class Testselenium22 {
    @Test
    @Description("")
    public void test_web_table(){

        WebDriver driver  = new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();


        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));

        List<WebElement> rowstable = table.findElements(By.tagName("tr"));

                  for(int i=0;i<rowstable.size();i++){
                      List<WebElement> col = rowstable.get(i).findElements(By.tagName("td"));
                      for(WebElement c: col){
                          System.out.println(c.getText());
                      }


                  }

driver.quit();


    }
}
