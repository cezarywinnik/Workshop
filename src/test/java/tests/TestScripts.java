package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static pageObjects.MainPage.searchForProduct;

public class TestScripts extends BaseTest {
    @Test
    public static void asUserIWouldLikeToSearchForAProduct() {
        searchForProduct("Faded");
    }
}