package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class AddToCartStep extends AbstractStepDefs {
    WebDriver driver = AbstractStepDefs.driver;

    @Given("I'm on the products page")
    public void i_am_on_the_products_page() {
        navigateTo("https://automationexercise.com/products");
    }

    @And("First element add to cart")
    public void first_element_add_to_cart() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300)");
        driver.findElements(By.className("add-to-cart")).get(0).click();
    }

    @Then ("Check modal is opened")
    public void check_modal_is_opened() {
        driver.findElements(By.className("btn-success"));
    }
}
