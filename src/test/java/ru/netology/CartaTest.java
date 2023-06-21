package ru.netology;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class CartaTest {

    private WebDriver driver;

    @BeforeAll
    static void setUpAll(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp(){driver = new ChromeDriver();}

    @AfterEach
    void tearDown(){
        driver.quit();
        driver = null;
    }
    @Test
    void shouldTestCarta() throws InterruptedException {
// загрузить страницу
        driver.get("http://localhost:9999/");
       // Thread.sleep(5000);
// поиск элементов
// взаимодействие с элементами

    }


}
