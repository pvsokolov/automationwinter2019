package lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimpleTest {
    @Test
    public void SimpleTest() {
        //1
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String handle = driver.getWindowHandle();
        driver.switchTo().window(handle);

        //2
        driver.navigate().to("https://epam.github.io/JDI/index.html");

        //3
        assertEquals(driver.getTitle(), "Home Page");
//s
        //4
        driver.close();
    }
}
