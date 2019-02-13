package homeWork3;

import base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import pageObjects.HomePage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomeWork3 extends SeleniumBase {

    private WebDriver driver;
    private HomePage homepage;

    @BeforeClass
    public void BeforeClass() {
        driver = new ChromeDriver();
        homepage = PageFactory.initElements(driver, HomePage.class);
    }

    @BeforeMethod
    public void BeforeMethod() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void AfterMethod() {
        driver.close();
    }

    @Test
    public void HomeWorkTest() {


//        String handle = driver.getWindowHandle();
//        driver.switchTo().window(handle);

        //1
        driver.navigate().to("https://epam.github.io/JDI/");

        //2
        assertEquals(driver.getTitle(), "Home Page");

        //3 Login
        homepage.login("epam", "1234");
//

        //4 Check user
        assertEquals(driver.findElement(By.cssSelector("[id = 'user-name'")).getText(), "PITER CHAILOVSKII");

        //5 Title
        assertEquals(driver.getTitle(), "Home Page");

        //6
        assertEquals(driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[1]/a")).getText(), "HOME");
        assertEquals(driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[2]/a")).getText(), "CONTACT FORM");
        assertEquals(driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[3]/a")).getText(), "SERVICE");
        assertEquals(driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[4]/a")).getText(), "METALS & COLORS");

        //7
        assertTrue(driver.findElement(By.cssSelector("[src*='Logo_Epam_Color.svg']")).isDisplayed());

        //9
        String mainTitel = driver.findElement(By.cssSelector("[name = 'main-title'")).getText();
        assertTrue(mainTitel.contains("EPAM FRAMEWORK WISHES"));

        //10
        if (!driver.findElements(By.cssSelector("[id='iframe']")).isEmpty()) ;
        driver.switchTo().frame(driver.findElement(By.cssSelector("[id='iframe']")));
        assertTrue(driver.findElement(By.xpath("/html/body/div/div[2]/main/div[2]/h3[2]/a")).getAttribute("href").contains("https://github.com/epam/JDI"));

        driver.close();
    }

}
