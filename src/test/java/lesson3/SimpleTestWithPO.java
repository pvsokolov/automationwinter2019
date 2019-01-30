package lesson3;

import base.SeleniumBase;
import base.lesson3.IndexPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTestWithPO extends SeleniumBase {
    private IndexPage indexPage;
    private WebDriver driver;


    @BeforeMethod
    public void initTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        indexPage = PageFactory.initElements(driver, IndexPage.class);
//        indexPage = new IndexPage(driver);
    }

    @AfterMethod
    public void closeTest() {
        driver.close();

    }

    @Test
    public void SimpleTest() {
        indexPage.open();
        indexPage.login("Philip", "qwerty");
    }


}
