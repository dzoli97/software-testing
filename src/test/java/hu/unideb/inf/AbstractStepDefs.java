package hu.unideb.inf;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public abstract class AbstractStepDefs {

    private static final int WAIT_TIME = 10;
    protected static final WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_TIME));
    }

    protected void navigateTo(String url) {
        driver.get(url);
        acceptCookiePolicy();
    }

    private void acceptCookiePolicy() {
        try {
            WebElement cookieAcceptButton = driver.findElement(By.className("fc-primary-button"));
            if (cookieAcceptButton.isDisplayed()) {
                cookieAcceptButton.click();
            }
        } catch (Exception e) {
            // Log or handle the exception if needed, e.g., if the cookie policy modal is not found
        }
    }
}
