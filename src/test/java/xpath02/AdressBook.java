package xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class AdressBook {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        String [] email = {"Tony", "max", "andrew", "kamol"};
        String emailEnd = "@gmail.com";
        Random random = new Random();
        int ran = random.nextInt(email.length);

        WebElement login = driver.findElement(By.xpath("//input[@id=\"session_email\"]"));
        WebElement pass = driver.findElement(By.xpath("//input[@id=\"session_password\"]"));
        WebElement signBtn = driver.findElement(By.xpath("//input[@id=\"submit\"]"));

        login.sendKeys(email[ran] + emailEnd);
        pass.sendKeys("123456");
        signBtn.click();

        WebElement message = driver.findElement(By.xpath("//div[@data-test=\"notice\"]"));

        if (message.isDisplayed()){
            System.out.println("Test pass");
        }else{
            System.out.println("Test failed");
        }

    }
}
