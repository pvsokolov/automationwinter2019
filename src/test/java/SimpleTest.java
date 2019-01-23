import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void SimpleTest() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://epam.github.io/JDI/index.html");
    }
}
