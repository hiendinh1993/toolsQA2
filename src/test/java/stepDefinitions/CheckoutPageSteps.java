package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.en.And;
import manager.FileReaderManager;
import pageObjects.CheckoutPage;
import testDataTypes.Customer;

public class CheckoutPageSteps {
    TestContext testContext;
    CheckoutPage checkoutPage;

    public CheckoutPageSteps(TestContext context) {
        testContext = context;
        checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
    }


    @And("enter {string} personal details on checkout page")
    public void enterPersonalDetailsOnCheckoutPage(String customerName) {
        Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
        checkoutPage.fill_PersonalDetails(customer);
    }

    @And("^select same delivery address$")
    public void select_same_delivery_address() {
//        checkoutPage.check_ShipToDifferentAddress(false);
    }

    @And("^select payment method as \"([^\"]*)\" payment$")
    public void select_payment_method_as_payment(String arg1) {
//        checkoutPage.select_PaymentMethod("CheckPayment");
    }

    @And("^place the order$")
    public void place_the_order() {
        checkoutPage.check_TermsAndCondition(true);
        checkoutPage.clickOn_PlaceOrder();
        testContext.getWebdriverManager().closeDriver();
    }

}
