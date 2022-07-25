package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
    TestContext testContext;
    HomePage homePage;

    public HomePageSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
    }

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page() {
        homePage.navigateTo_HomePage();
    }

    @When("^he search for \"([^\"]*)\"$")
    public void he_search_for(String product) {
        homePage.perform_Search(product);
    }

    @When("he click on search icon")
    public void heClickOnSearchIcon() {
        homePage.clickOnSearchIcon();

    }

    @And("he input keyword {string}")
    public void heInputKeyword(String keyword) {
        homePage.setInputSearch(keyword);
    }

    @And("he press enter")
    public void hePressEnter() {
        homePage.clickEnter();
    }
}
