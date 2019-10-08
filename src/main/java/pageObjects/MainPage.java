package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    private static SelenideElement searchBox = $(".search_query");
    private static SelenideElement searchButton = $(".button-search");

    public  static void searchForProduct(String productName) {
        searchBox.sendKeys(productName);
        searchButton.click();
    }
}