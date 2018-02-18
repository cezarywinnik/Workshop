package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static pageobject.MainPage.searchForHotelInLocation;

public class ExampleTest extends BaseTest {

    @Test
    public static void searchForHotelsInWroclaw() {
        searchForHotelInLocation("Wroclaw");
    }
}
