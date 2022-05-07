package testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Practice {
//    public static void main(String[] args) {
//
//
//    }

    @Test
    public void afirstTest()
    {
        System.out.println("This is my a first testNG run");
        Assert.assertEquals(12,15);
    }

    @Test
    public void bfirstTest(){
        System.out.println("This is my b first testNG run");
    }

    @BeforeClass
    public void myThirdTest() {
        System.out.println("This is beforeClass Example");
    }

    @BeforeMethod
    public void myFourthTest() {
        System.out.println("This is running before each method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This my after method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("this is after class method");
    }
}
