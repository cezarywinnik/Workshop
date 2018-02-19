package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static org.openqa.selenium.By.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private static SelenideElement txtCitySearchBox = $(className("select2-focusser"));

    public static void provideTheLocationNameInSearchBox(String location) {
        txtCitySearchBox.val(location);
    }
}