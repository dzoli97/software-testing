package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddMultipleProductToCartStep extends AbstractStepDefs{
    WebDriver driver = AbstractStepDefs.driver;

    @And("Open first product details")
    public void open_first_product_details() {
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")).click();
    }

    @When("I on the first product details, add this product 3x to cart")
    public void add_this_product_3x_to_cart() {
        driver.findElement(By.id("quantity")).sendKeys("3");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
    }

    @Given ("I'm on the cart page")
    public void im_on_the_cart_page() {
        navigateTo("https://automationexercise.com/view_cart");
    }

    @And ("Check number of products in cart")
    public void check_number_of_products_in_cart() {
        navigateTo("https://automationexercise.com/view_cart");
        String numberOfProduct = driver.findElement(By.xpath("//*[@id=\"product-1\"]/td[4]/button")).getText();

        numberOfProduct.equals("31");
    }
}
