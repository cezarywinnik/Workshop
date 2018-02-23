package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static helpers.TestData.CITY_WROCLAW;
import static helpers.TestData.CITY_WROCLAW_IN_SEARCH_BOX;
import static pageObjects.HomePage.checkThatCityHasBeenFoundInSearchBox;
import static pageObjects.HomePage.clickOnHighlightedItemFromSearchBoxResults;
import static pageObjects.HomePage.provideTheLocationSearchBox;

public class HomePageTest extends BaseTest {
    @Test
    public static void asUserIWouldLikeTosearchForHotelsInWroclaw() {
        provideTheLocationSearchBox(CITY_WROCLAW);
        clickOnHighlightedItemFromSearchBoxResults();
        checkThatCityHasBeenFoundInSearchBox(CITY_WROCLAW_IN_SEARCH_BOX);
    }
}