package core;

import core.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public static final String URL = "http://sabaleuski.com";

    public WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getInstance().getDriver();
        PageFactory.initElements(driver, this);
        driver.get(URL);
    }
}
