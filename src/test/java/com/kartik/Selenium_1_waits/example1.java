package com.kartik.Selenium_1_waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class example1 {

@Description()
    @Test
    public void selenium_waits(){
    EdgeOptions edgeOptions= new EdgeOptions();
    edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
    edgeOptions.addArguments("--Start maximized");


    EdgeDriver driver= new EdgeDriver(edgeOptions);
    driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



try{
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }




    WebElement searchBox= driver.findElement(By.cssSelector("input[id='gh-ac']"));
    searchBox.sendKeys("macmini");

    WebElement searchBoxButton = driver.findElement(By.cssSelector("input[value='Search']"));
    searchBoxButton.click();


    try{
        Thread.sleep(3000);
    } catch (InterruptedException e){
        throw new RuntimeException(e);
    }



    List<WebElement> searchTitles = driver.findElements(By.cssSelector(".s-item_title"));
    List<WebElement> searchTitlesPrices = driver.findElements(By.cssSelector(".s-item_price"));

    int size = Math.min(searchTitles.size(),searchTitlesPrices.size());
    for (int i = 0; i<=size;i++){
        System.out.println("Title:" + searchTitles.get(i).getText() + " || "+ "Prices: " + searchTitlesPrices.get(i).getText());
   System.out.println();
    }






    try{
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    driver.quit();

}


}
