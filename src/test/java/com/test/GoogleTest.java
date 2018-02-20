package com.test;

import base.BaseTest;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class GoogleTest extends BaseTest {

    private static final int FIRST_LINK = 0;
    private static final String SEARCH_VALUE = "UBS";
    private static final SelenideElement SEARCH_FIELD = $(".gsfi");
    private static final SelenideElement UBS_LOGO = $("a[title='UBS']");
    private static final ElementsCollection LIST_OF_RESULTS = $$(".rc .r >a");

    @Test
    public void searchUbsInGoogle() {
        System.setProperty("selenide.browser", "Chrome");
        open("https://google.com");
        SEARCH_FIELD.setValue(SEARCH_VALUE).sendKeys(Keys.ENTER);
        assertEquals(findLinkInTheList(FIRST_LINK).getText(),
                "Our financial services around the globe | UBS Global topics");
        findLinkInTheList(FIRST_LINK).click();
        assertTrue(UBS_LOGO.is(visible), "UBS logo isn't shown");

    }

    private SelenideElement findLinkInTheList(int linkNumber) {
        return LIST_OF_RESULTS.get(linkNumber);
    }
}
