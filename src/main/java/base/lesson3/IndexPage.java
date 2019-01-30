package base.lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage {

    @FindBy(css  = "[id='user-icon']")
    private WebElement loginIcon;

    @FindBy(css  = "[id='name']")
    private WebElement user;

    @FindBy(css = "[id='password']")
    private WebElement pwd;

    @FindBy(css = "[id='name']")
    private WebElement submitButton;

    private WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver = driver;

    }

    public void login(String name, String password) {
        loginIcon.click();
        user.sendKeys(name);
        pwd.sendKeys(password);
        submitButton.click();
    }


    public void open() {
        driver.get("https://epam.github.io/JDI/index.html");
    }
}
