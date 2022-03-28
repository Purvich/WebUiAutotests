package com.saucedemo.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.saucedemo.pages.MainPage;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    @BeforeAll
    @Step("Open browser")
    static void setUp() {
        Configuration.timeout = 10000;
    }

    @BeforeEach
    @Step("Open site")
    void openSite() {
        new MainPage()
                .openMainPage();
    }

    @AfterEach
    @Step("Clearing browser cookies")
    void cleaningCookies() {
        Selenide.refresh();
        Selenide.clearBrowserCookies();
    }
}
