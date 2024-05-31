package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLogoutStep {

    WebDriver driver = AbstractStepDefs.driver;

    @And("Click logout button")
    public void click_logout_button() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
    }

    @Then ("User is out")
    public void user_is_out() {
        driver.findElement(By.name("password"));
    }
}
