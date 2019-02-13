package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

public class HomePage {

    @FindBy(css = ".profile-photo")
    private WebElement profileButton;

    @FindBy(css = "[id='name']")
    private WebElement login;

    @FindBy(css = "[id='password']")
    private WebElement password;

    @FindBy(css = "[type='submit']")
    private WebElement submit;

    public void login(String name, String psd) {
        profileButton.click();
        login.sendKeys(name);
        password.sendKeys(psd);
        submit.click();
    }

}
