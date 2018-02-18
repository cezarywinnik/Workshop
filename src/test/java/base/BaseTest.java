package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static config.TestConfig.setChrome;
import static pageobject.MainPage.openHomePage;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        setChrome();
        openHomePage();
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
