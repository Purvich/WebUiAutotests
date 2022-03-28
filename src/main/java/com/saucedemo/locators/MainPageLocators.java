package com.saucedemo.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPageLocators {

    //input "Username"
    public SelenideElement inputUsername = $(By.id("user-name"));

    //input "Password"
    public SelenideElement inputPassword = $(By.id("password"));

    //button "LOGIN"
    public SelenideElement buttonLogin = $(By.id("login-button"));

    //error text authorization
    public SelenideElement errorTextAuthorization = $(By.xpath("//h3[@data-test=\"error\"]"));
}
