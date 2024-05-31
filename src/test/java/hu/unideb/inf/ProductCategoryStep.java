package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class ProductCategoryStep extends AbstractStepDefs {
    WebDriver driver = AbstractStepDefs.driver;

    @And ("Select woman dress category")
    public void select_woman_dress_category() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 150)");
        driver.findElements(By.className("fa-plus")).get(0).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div[1]/div[1]/div[2]/div/ul/li[1]/a")).click();
    }

    @Then ("Check listed products")
    public void check_listed_products() {
        WebElement element = driver.findElement(By.className("title"));

        String text = element.getText();

        text.equals("Women - Dress Products");
    }

}