package xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParabankTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");


        WebElement login = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        WebElement pass = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        WebElement signBtn = driver.findElement(By.xpath("//input[@type=\"submit\"]"));

        login.sendKeys("test");
        pass.sendKeys("pass");
        signBtn.click();

        WebElement message = driver.findElement(By.xpath("//p[@class=\"error\"]"));

        if (message.isDisplayed()){
            System.out.println("Test Pass");
        }
        else{
            System.out.println("Test Fail");
        }


    }
}
