package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import manager.WebdriverManager;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver driver;
    private static WebdriverManager webdriverManager;
    TestContext testContext;

    public Hooks(TestContext context) {
        testContext = context;
    }

    @Before
    public void initTest() {
        driver = testContext.getWebdriverManager().getDriver();
    }

    @After
    public void endTest() {
//        testContext.getWebdriverManager().getDriver().quit();
//        driver.quit();
    }

}
