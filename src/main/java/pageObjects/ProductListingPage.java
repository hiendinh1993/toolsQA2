package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductListingPage {
    WebDriver driver;

    public ProductListingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "button.single_add_to_cart_button")
    private WebElement btn_AddToCart;

    @FindAll(@FindBy(how = How.CSS, using = ".noo-product-thumbnail"))
    private List<WebElement> prd_List;

    public void clickOn_AddToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(btn_AddToCart));
        btn_AddToCart.click();
    }

    public void select_Product(int productNumber) {
        prd_List.get(productNumber).click();
    }
}
