package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static config.TestConfig.ENVIRONMENT_URL;

public class BaseTest {
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        browser = CHROME;
        startMaximized = true;
        baseUrl = ENVIRONMENT_URL;
        open(baseUrl);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        closeWebDriver();
    }
}
