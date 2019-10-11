package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DressesPage extends MainPage{
    private static SelenideElement labelResultsNumber = $(".heading-counter");

    public static void verifyThatResultsArePresent(Integer expectedNumber) {
        allProductsOnThePage.shouldHaveSize(expectedNumber);
        labelResultsNumber.shouldHave(Condition.text(expectedNumber + " results have been found."));
    }

    public static void verifyThatSearchWordIsShownProperly(String searchWord) {
        labelSearchWord.shouldHave(Condition.text(searchWord));
    }
}
