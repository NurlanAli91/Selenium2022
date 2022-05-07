package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumPractice {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup(); // this line creates connection between driver and selenium
        // and set up the driver

        WebDriver driver = new ChromeDriver(); // we create instance of chromeDriver
        driver.manage().window().maximize();

        driver.get("https://www.google.com/"); // it will navigate to the http adress


        System.out.println(driver.getTitle());
        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();

        driver.navigate().to("https://www.etsy.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.close();



    }
}
