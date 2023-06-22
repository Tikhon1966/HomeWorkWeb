package ru.netology;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class CartaSelenideTest {

@Test
    void shouldTest(){
    open("http://localhost:9999/");
    SelenideElement form = $("[form-field_theme_alfa-on-white]");
    //form.$("[data-test-id=name] input").setValue("Петров Иван");
    //SelenideElement form2 = $("[input_theme_alfa-on-white]");
    //form2.$("[input__top]").setValue("+79161111111");

}
}
