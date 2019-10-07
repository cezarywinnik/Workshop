package testsExample;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.browser;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;

public class UbsTest {
    private final int FIRST_LINK = 0;
    private SelenideElement searchField = $(".gLFyf");
    private SelenideElement UBS_LOGO = $(".logo__img");
    private ElementsCollection listOfResults = $$(".rc .r >a");

    private SelenideElement getTheLinkInTheList(int linkNumber) {
        return listOfResults.get(linkNumber);
    }

    private void searchForUbs() {
        String SEARCH_VALUE = "UBS";
        searchField.click();
        searchField
                .setValue(SEARCH_VALUE)
                .sendKeys(Keys.ENTER);
    }

    private void checkThatUbsLinkIsOnTheFirstPosition() {
        getTheLinkInTheList(FIRST_LINK).shouldHave(text("Our financial services in your country | UBS United States"));
    }

    private void clickOnFirstLinkFromSearchResults() {
        getTheLinkInTheList(FIRST_LINK).click();
    }

    private void checkThatUbsWebsiteIsDisplayed() {
        UBS_LOGO.shouldBe(visible);
    }

    @BeforeMethod
    public void setUpGoogle() {
        WebDriverManager.chromedriver().version("77.0.3865.40").setup();
        browser = CHROME;
        startMaximized = true;
        open("https://google.com");
    }

    @AfterMethod
    public void close() {
        closeWebDriver();
    }

    @Test
    public void searchUbsInGoogle() {
        searchForUbs();
        checkThatUbsLinkIsOnTheFirstPosition();
        clickOnFirstLinkFromSearchResults();
        checkThatUbsWebsiteIsDisplayed();
    }
}