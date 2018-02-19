package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static config.BrowserProperties.setUpWebBrowser;
import static config.TestConfig.HOME_PAGE;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        setUpWebBrowser(CHROME);
        open(HOME_PAGE);
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
