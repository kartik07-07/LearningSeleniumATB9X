package com.kartik.Flipkart_Project;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class E_commerce_site {
    ChromeDriver driver;

    @BeforeTest
    public void openBrowser(){

            ChromeOptions Options = new ChromeOptions();
        Options.addArguments("--guest");
        driver = new ChromeDriver(Options);
    }

    @Description("Verify the site")
    @Test
    public void test_site(){

        driver.manage().window().maximize();
        String URL= "https://www.flipkart.com/";
        driver.get(URL);
        driver.manage().window().maximize();
//
//WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
//login.sendKeys("9834795365");
//login.submit();
//
//        try{
//            Thread.sleep(10000);
//
//        }catch (InterruptedException e){
//            throw  new RuntimeException(e);
//
//        }



        // at search box  search Laptop
        WebElement searchBOx = driver.findElement(By.xpath("//input[@name='q']"));
        searchBOx.sendKeys("Laptop");
        searchBOx.submit();

        try{
            Thread.sleep(5000);

        }catch (InterruptedException e){
            throw  new RuntimeException(e);

        }
//Brand

        WebElement brand = driver.findElement(By.xpath(" //div[text()='Brand']"));

        brand.click();

        try{
            Thread.sleep(3000);

        }catch (InterruptedException e){
            throw  new RuntimeException(e);

        }
//click on HP option
        //div[text()='HP']
        WebElement brand_name = driver.findElement(By.xpath("  //div[text()='HP']"));

        brand_name.click();


        List<WebElement> productsName = driver.findElements(By.cssSelector("KzDlHZ"));
        List<WebElement> Productprice = driver.findElements(By.cssSelector("Nx9bqj _4b5DiR"));
      for(int i =0; i<5 && i<productsName.size();i++){
          System.out.println("Product:"+productsName.get(i).getText() + "| Price:" + Productprice.get(i).getText());


          WebElement firstProduct = driver.findElements(By.cssSelector("")).get(0);
          firstProduct.click();



          for(String handle:driver.getWindowHandles()){
              driver.switchTo().window(handle);

          }
          WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to Cart')"));
          addToCart.click();



          WebElement cartItem = driver.findElement(By.xpath("//span[contains(text(),'My Cart')]"));
          if(cartItem.isDisplayed()){
              System.out.println("Product successfully added to the cart!");
          }else{
              System.out.println("Failed to add product to the cart.");
          }
      }

    }
    @AfterTest
    public void closeBrowser(){
        try{
            Thread.sleep(5000);

        }catch (InterruptedException e){
            throw  new RuntimeException(e);

        }
    }

}
