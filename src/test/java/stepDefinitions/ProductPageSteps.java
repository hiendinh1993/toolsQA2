package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pageObjects.ProductListingPage;

public class ProductPageSteps {
    TestContext testContext;
    ProductListingPage productListingPage;

    public ProductPageSteps(TestContext context) {
        testContext = context;
        productListingPage = testContext.getPageObjectManager().getProductListingPage();
    }

    @When("^choose to buy the first item$")
    public void choose_to_buy_the_first_item() {
        productListingPage.select_Product(0);
        Select color = new Select(testContext.getWebdriverManager().getDriver().findElement(By.id("pa_color")));
        color.selectByIndex(1);
        Select size = new Select(testContext.getWebdriverManager().getDriver().findElement(By.id("pa_size")));
        size.selectByIndex(1);
        productListingPage.clickOn_AddToCart();
    }
}
