package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private static String HOME_PAGE = "https://www.phptravels.net/";

    private static SelenideElement LOCATION_ENTRY_FIELD = $(By.className("select2-focusser"));

    public static void openHomePage() {
        open(HOME_PAGE);
    }

    public static void searchForHotelInLocation(String hotel) {
        LOCATION_ENTRY_FIELD.val(hotel);
        sleep(4000);
    }
}
