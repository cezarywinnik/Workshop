package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private static SelenideElement txtLocationSearchBox = $("#s2id_autogen10 .select2-focusser");
    private static SelenideElement lblHighlightedSearchBoxElement = $("#select2-drop .select2-result-sub");
    private static SelenideElement lblLocationSearchBoxText = $("#s2id_autogen10 .select2-chosen");

    public static void provideTheLocationSearchBox(String location) {
        txtLocationSearchBox.sendKeys(location);
    }

    public static void clickOnHighlightedItemFromSearchBoxResults() {
        lblHighlightedSearchBoxElement.click();
    }

    public static void checkThatCityHasBeenFoundInSearchBox(String location) {
        lblLocationSearchBoxText.shouldHave(text(location));
    }
}