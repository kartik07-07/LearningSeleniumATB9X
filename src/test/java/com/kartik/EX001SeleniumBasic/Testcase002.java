package com.kartik.EX001SeleniumBasic;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testcase002 {
    @Test
    public void test_selenium02() {
        EdgeDriver driver = new EdgeDriver();


        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }
}