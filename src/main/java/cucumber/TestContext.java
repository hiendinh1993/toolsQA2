package cucumber;

import manager.PageObjectManager;
import manager.WebdriverManager;

public class TestContext {
    private WebdriverManager webdriverManager;
    private PageObjectManager pageObjectManager;

    public TestContext() {
        webdriverManager = new WebdriverManager();
        pageObjectManager = new PageObjectManager(webdriverManager.getDriver());
    }

    public WebdriverManager getWebdriverManager() {
        return webdriverManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}
