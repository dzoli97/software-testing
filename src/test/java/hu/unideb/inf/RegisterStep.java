package hu.unideb.inf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import io.cucumber.java.en.*;

public class RegisterStep extends AbstractStepDefs {

    WebDriver driver = AbstractStepDefs.driver;

    @Given("I'm on the registration page")
    public void i_am_on_the_registration_page() {
        navigateTo("https://automationexercise.com/signup");
    }

    @Then("I should see a registration first step again")
    public void i_should_see_a_registration_first_step_again() {
        driver.findElement(By.name("name"));
    }

    @When("I fill in the registration form with valid data but email is exist")
    public void i_fill_in_the_registration_form_with_valid_data_but_email_is_exist() {
        driver.findElement(By.name("name")).sendKeys("Test User");
        driver.findElements(By.name("email")).get(1).sendKeys("testuser1@example.com");
    }

    @When("I fill in the registration form with valid data")
    public void i_fill_in_the_registration_form_with_valid_data() {
        driver.findElement(By.name("name")).sendKeys("Test User");
        driver.findElements(By.name("email")).get(1).sendKeys("testuser23@example.com");
    }

    @And("I submit the form")
    public void i_submit_the_form() {
        driver.findElements(By.cssSelector("button[type='submit']")).get(1).click();
    }

    @Then("I should see a registration first step success")
    public void i_should_see_a_registration_first_step_success() {
        driver.findElement(By.name("name"));
    }
}
