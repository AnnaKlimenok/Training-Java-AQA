package page;

import core.BasePage;
import core.driver.Waiter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "input[type='email']")
    private WebElement userLogin;

    @FindBy(css = "a[href='/users/sign_in']")
    private WebElement loginButton;

    public void login() {
        loginButton.click();
        Waiter.waitForElement(userLogin);
        userLogin.sendKeys("lala@gmail.com");
    }

    public void executeAbstractAction() {
        Actions actions = new Actions(driver);
        actions.clickAndHold(userLogin).moveToElement(loginButton).
                release().sendKeys("asdasd").
                doubleClick(userLogin).build().perform();
    }
}
