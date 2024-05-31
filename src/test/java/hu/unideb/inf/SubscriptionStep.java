package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriptionStep extends AbstractStepDefs {
    WebDriver driver = AbstractStepDefs.driver;

    @Given("I'm on the main page")
    public void i_am_on_the_main_page() {
        navigateTo("https://automationexercise.com");
    }

    @And ("Give email address to subscription input")
    public void give_email_address_to_subscription_input() {
        driver.findElement(By.id("susbscribe_email")).sendKeys("test-email@gmail.com");
    }

    @Then ("Submit subscription")
    public void submit_subscription() {
        driver.findElement(By.id("subscribe")).click();
    }
}
