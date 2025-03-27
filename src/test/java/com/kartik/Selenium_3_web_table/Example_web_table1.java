package com.kartik.Selenium_3_web_table;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_web_table1 {
    EdgeDriver driver;


    @BeforeTest
    public void openBrower() {

        EdgeOptions option = new EdgeOptions();
        option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        option.addArguments("--incognito");
        driver = new EdgeDriver(option);

    }

    @Description("verify the test")
    @Test
    public void testwebtable() throws InterruptedException {

        driver.manage().window().fullscreen();
        String URL = "https://awesomeqa.com/webtable.html";
        driver.get(URL);

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();

        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();

         System.out.println(row);
        System.out.println(col);

        String first_part = "//table[@id='customers']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";






        for(int i=2;i<=row;i++){

            for(int j=1;j<=col;j++){

                String dynamic_xpath = first_part+i+second_part+j+third_part;
                String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
//                System.out.println(data);

                if(data.contains("Helen Bennett")){

                    String country_path= dynamic_xpath+"/following-sibling::td";
                    String country_company= dynamic_xpath+"/preceding-sibling::td";
                    String country_text = driver.findElement(By.xpath(country_path)).getText();
                    String company_text = driver.findElement(By.xpath(country_company)).getText();
                    System.out.println(".......");
                    System.out.println("Helen Bennett is In -" + country_text);
                    System.out.println("Helen Bennett is In -" + company_text);

                }
            }

        }


    }


    @AfterTest
    public void closeBrowser() {


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        driver.quit();
    }
}