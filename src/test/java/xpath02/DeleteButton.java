package xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteButton {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick=\"addElement()\"]"));
        addElementButton.click();


        WebElement deleteElement = driver.findElement(By.xpath("//*[.=\"Delete\"]"));

        if (deleteElement.isDisplayed()){
            System.out.println("Button is displayed");
        }else{
            System.out.println("Button IS NOT displayed");
        }

        WebElement refDeleteElement = driver.findElement(By.xpath("//*[.=\"Delete\"]"));

        refDeleteElement.click();

        if (!deleteElement.isDisplayed()){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }



    }
}
