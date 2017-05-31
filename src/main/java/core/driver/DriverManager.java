package core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private DriverManager() {}

    private static volatile DriverManager instance;

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static DriverManager getInstance() {
        if (instance == null) {
            synchronized (DriverManager.class) {
                if (instance == null) {
                    instance = new DriverManager();
                }
            }
        }
        return instance;
    }

    public WebDriver getDriver() {
        if (driver.get() == null) {
            driver.set(new FirefoxDriver());
        }
        return driver.get();
    }

    public void stopDriver() {
        getInstance().getDriver().quit();
        driver.set(null);
    }
}
