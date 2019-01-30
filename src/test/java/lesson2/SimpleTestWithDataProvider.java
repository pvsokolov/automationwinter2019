package lesson2;

import base.SeleniumBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class SimpleTestWithDataProvider extends SeleniumBase {

    @DataProvider
    private Object[][] simpleDataProvider() {
        return new Object[][]{
                {0, "Ivan"},
                {1, "Roman"},
                {2, "Philip"}
        };
    }

    @Test(dataProvider = "simpleDataProvider")
    public void simpleTest(int i, String s) {
        System.out.println("int = " + i + "\n" + "String = " + s);

    }

}
