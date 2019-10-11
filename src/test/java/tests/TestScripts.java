package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static pageObjects.DressesPage.verifyThatSearchWordIsShownProperly;
import static pageObjects.DressesPage.verifyThatResultsArePresent;
import static pageObjects.MainPage.*;

public class TestScripts extends BaseTest {
    @Test
    public static void asUserIWouldLikeToSearchForAProduct() {
        searchForProduct(FADED);
    }

    @Test
    public static void asUserIWouldLikeToSearchDresses_TC02() {
        searchForProduct(DRESSES);
        verifyThatResultsArePresent(7);
        verifyThatSearchWordIsShownProperly(DRESSES);
    }
}