package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.technovaschool.com/");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "technovaschool";

        if (actualUrl.contains(expectedUrl)){
            System.out.println("The test passed");
        }else{
            System.out.println("Test failed");
        }

        String actualTitle = driver.getTitle();
        String expectedTitle = "IT School Online | Tech Nova School";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("The test passed");
        }else{
            System.out.println("Test failed");
        }
    }
}
