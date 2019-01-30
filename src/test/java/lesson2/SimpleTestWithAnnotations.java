package lesson2;

import base.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;
import static org.testng.Assert.assertEquals;

public class SimpleTestWithAnnotations extends SeleniumBase {

    private WebDriver driver;



    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }

    @Test(invocationCount = 3)
    public void SimpleTest() {
        //1


        String handle = driver.getWindowHandle();
        driver.switchTo().window(handle);

        //2
        driver.navigate().to("https://epam.github.io/JDI/index.html");

        //3
        assertEquals(driver.getTitle(), "Home Page");


    }
}
