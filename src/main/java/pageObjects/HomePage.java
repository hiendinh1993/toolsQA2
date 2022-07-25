package pageObjects;

import manager.FileReaderManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "a.noo-search")
    private WebElement searchIcon;

    @FindBy(how = How.CSS, using = "input.form-control")
    private WebElement inputSearch;

    public void perform_Search(String search) {
        driver.navigate().to("https://shop.demoqa.com/?s=" + search + "&post_type=product");
    }

    public void navigateTo_HomePage() {
        driver.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationUrl());
    }

    public void clickOnSearchIcon() {
        this.searchIcon.click();
    }

    public void setInputSearch(String key) {
        this.inputSearch.sendKeys(key);
    }

    public void clickEnter() {
        this.inputSearch.sendKeys(Keys.ENTER);
    }
}
