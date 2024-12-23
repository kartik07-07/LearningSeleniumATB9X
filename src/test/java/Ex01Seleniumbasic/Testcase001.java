package Ex01Seleniumbasic;



import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Testcase001 {
    @Description ("Open the app.vwo.com")
    @Test

    public void test_selenium001(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }
















}
