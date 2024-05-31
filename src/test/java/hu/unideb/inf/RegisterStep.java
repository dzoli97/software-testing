package hu.unideb.inf;

import org.openqa.selenium.Keys;
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
        driver.findElement(By.className("login-form"));
    }

    @When("I fill in the registration form with valid data but email is exist")
    public void i_fill_in_the_registration_form_with_valid_data_but_email_is_exist() {
        driver.findElement(By.name("name")).sendKeys("Test User");
        driver.findElements(By.name("email")).get(1).sendKeys("testuser1@example.com");
    }

    @When("I fill in the registration form with valid data")
    public void i_fill_in_the_registration_form_with_valid_data() {
        driver.findElement(By.name("name")).sendKeys("Test User");
        driver.findElements(By.name("email")).get(1).sendKeys("testuser1211@example.com");
    }

    @And("I submit the form")
    public void i_submit_the_form() {
        driver.findElements(By.cssSelector("button[type='submit']")).get(1).click();
    }

    @Then("I should see a registration first step success")
    public void i_should_see_a_registration_first_step_success() {
        driver.findElement(By.name("first_name"));
    }

    @When("I fill in the registration second form with valid data")
    public void i_fill_in_the_registration_second_form_with_valid_data() {
        driver.findElement(By.name("first_name")).sendKeys("Test");
        driver.findElement(By.name("last_name")).sendKeys("User");
        driver.findElement(By.name("password")).sendKeys("U01ser02");
        driver.findElement(By.name("address1")).sendKeys("test address for automation testing 24");
        driver.findElement(By.name("state")).sendKeys("Current State");
        driver.findElement(By.name("city")).sendKeys("Város");
        driver.findElement(By.name("zipcode")).sendKeys("0001");
        driver.findElement(By.name("mobile_number")).sendKeys("00000000");
    }


    @And ("I submit second form")
    public void i_submit_second_form() {
        driver.switchTo().activeElement().sendKeys(Keys.TAB);
        driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    }

    @Then ("I should see a registration second step success")
    public void i_should_see_a_registration_second_step_success() {
        driver.findElement(By.className("pull-right"));
    }
}
