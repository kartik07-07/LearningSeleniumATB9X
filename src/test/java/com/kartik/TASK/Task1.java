package com.kartik.TASK;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;


public class Task1 {
    ChromeDriver driver;
    WebDriverWait wait;

    @BeforeTest
            public void openbrowser(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options. addArguments("--guest");
         driver = new ChromeDriver(options);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    }


     @Description("verify the task")
     @Test
     public void test_the_Task() throws InterruptedException{
         // X- path

         //  //body/div/div/div/header/div[2]/nav/ul/li[2]/span

//    //header["oxd-topbar-body-nav-tab-item"]



         driver.manage().window().fullscreen();
        String URL=("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get(URL);
         driver.manage().window().fullscreen();


         try{
             Thread.sleep(5000);
         }catch(InterruptedException e){
           throw new RuntimeException(e);
       //  wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         }



         //step 1 :- we have to add username
         //step 2 :- then add password
         //step 3 :- click on the login button

//Username
         WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        // WebDriver dri =driver.findElement(By.xpath("//input[@placeholder='Username']"));
         firstname.sendKeys("Admin");

         WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
         // WebDriver dri =driver.findElement(By.xpath("//input[@placeholder='Username']"));
         password.sendKeys("admin123");

         //button xpath
         //button['oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']

         WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
         button.click();

         //Till here its working properly but until we add implicitwait above  it will  give an error?




        //After the login
                // click on the job option
         // Select the Employement

//         WebElement PMI = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div/div/div/aside/nav/div[2]/ul/li[2]/a/span")));
//
//         // Hover and click on Admin using Actions class
//         Actions actions = new Actions(driver);
//         actions.moveToElement(PMI).click().perform();



         WebElement adminMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']")));
         // Hover and click on the Admin tab using Actions class
        Actions actions = new Actions(driver);
        actions.moveToElement(adminMenu).click().perform();




//         WebElement job = driver.findElement(By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent --visited']"));
//         job.click();
//
//         Actions  actions = new Actions(driver);


     }
@AfterTest
public void closebrowser(){
    try{
 Thread.sleep(5000);
    }catch(InterruptedException e){
        throw new RuntimeException(e);

    }
    driver.quit();

}
}

//package com.kartik.TASK;
//
//import io.qameta.allure.Description;
//import org.openqa.selenium.By;
//import org.openqa.selenium.PageLoadStrategy;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class Task1 {
//    ChromeDriver driver;
//    WebDriverWait wait;
//
//    @BeforeTest
//    public void openBrowser() {
//        ChromeOptions options = new ChromeOptions();
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        options.addArguments("--guest");
//        driver = new ChromeDriver(options);
//
//        // Initialize WebDriverWait
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Maximize window before navigating to URL
//        driver.manage().window().maximize();
//    }
//
//    @Description("Verify the task")
//    @Test
//    public void testTheTask() {
//        // Navigate to the login page
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//        // Wait for username field to be clickable
//        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Username']")));
//        username.sendKeys("Admin");
//
//        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//        password.sendKeys("admin123");
//
//        // Locate and click the login button
//        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class, 'orangehrm-login-button')]"));
//        loginButton.click();
//
//        // Wait for the Admin menu option to be clickable
//        WebElement adminMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Admin']")));
//
//        // Hover and click on the Admin tab using Actions class
//        Actions actions = new Actions(driver);
//        actions.moveToElement(adminMenu).click().perform();
//
//        // Optional: Wait to observe the click before closing (for debugging)
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @AfterTest
//    public void closeBrowser() {
//        driver.quit();
//    }
//}
