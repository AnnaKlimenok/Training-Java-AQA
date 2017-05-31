import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import page.LoginPage;

public class WebDriverTest extends BaseTest {

    @Test
    public void webDriverTest() {
        By by = By.cssSelector("div.b-general h3 a");
        WebElement element = driver.findElement(by);
        element.click();
    }

//    @Test
//    public void runDriver() {
//        LoginPage loginPage = new LoginPage();
//        loginPage.login();
//    }

}
