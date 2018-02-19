package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static helpers.TestData.CITY_WROCLAW;
import static pageObjects.HomePage.provideTheLocationNameInSearchBox;

public class HomePageTest extends BaseTest {

    @Test
    public static void asUserIWouldLikeTosearchForHotelsInWroclaw() {
        provideTheLocationNameInSearchBox(CITY_WROCLAW);
    }
}