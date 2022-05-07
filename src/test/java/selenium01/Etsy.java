package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");

        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("gift box" + Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Gift box | Etsy";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }
    }
}
