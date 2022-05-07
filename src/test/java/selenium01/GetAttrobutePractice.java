package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttrobutePractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement LinkElement = driver.findElement(By.partialLinkText("Forgot"));

        String actualAttributeValue = driver.findElement(By.partialLinkText("Forgot")).getAttribute("href");
        String expectedAttributeValue = "forgot-password";

        if (actualAttributeValue.contains(expectedAttributeValue)) {
            System.out.println("Value is correct");
        } else {
            System.out.println("Value is false");
        }

        driver.findElement(By.partialLinkText("Forgot")).click();
        boolean header = driver.findElement(By.tagName("h3")).isDisplayed();

        if (header){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }
    }
}
