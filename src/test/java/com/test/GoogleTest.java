package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;



public class GoogleTest {

        @Test
        public void search_selenide_in_google() {
            open("https://google.com/ncr");
            $(By.name("q")).val("selenide").pressEnter();
            $$("#ires .g").shouldHave(sizeGreaterThan(1));
            $("#ires .g").shouldBe(visible).shouldHave(
                    text("Selenide: concise UI tests in Java"),
                    text("selenide.org"));
        }

}
