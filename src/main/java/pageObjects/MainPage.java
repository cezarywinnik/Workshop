package pageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public static final String FADED = "Faded";
    public static final String DRESSES = "Dresses";

    private static SelenideElement searchBox = $(".search_query");
    private static SelenideElement searchButton = $(".button-search");
    static SelenideElement labelSearchWord = $(".lighter");

    static ElementsCollection allProductsOnThePage = $$(".product_list.grid.row > li");

    public  static void searchForProduct(String productName) {
        searchBox.sendKeys(productName);
        searchButton.click();
    }
}