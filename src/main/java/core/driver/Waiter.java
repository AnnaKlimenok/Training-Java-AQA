package core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    public static void waitForElement(WebElement element) {
        WebDriverWait waiter = new WebDriverWait(DriverManager.getInstance().getDriver(), 10);
        waiter.until(ExpectedConditions.elementToBeClickable(element));
    }

//    public static WebDriverWait waitForHomeTitle(WebDriver driver, long timeoutMilliseconds) {
//        WebDriverWait webDriverWait = new WebDriverWait(driver, timeoutMilliseconds);
//        ExpectedCondition<Boolean> expectedCondition = new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver webDriver) {
//                return webDriver.getTitle().equals("Home page");
//            }
//        };
//        return webDriverWait;
//    }

}
