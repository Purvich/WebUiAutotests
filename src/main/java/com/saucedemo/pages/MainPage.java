package com.saucedemo.pages;

import com.saucedemo.base.BaseView;
import com.saucedemo.locators.MainPageLocators;
import com.saucedemo.params.UrlData;
import io.qameta.allure.Step;

public class MainPage extends BaseView {

    @Step("Open Main Page")
    public MainPage openMainPage() {
        openSite(UrlData.MAIN_PAGE_URL);
        return this;
    }

    @Step("Authorization")
    public InventoryPage authorization(String username, String password) {
        locators().inputUsername.sendKeys(username);
        locators().inputPassword.sendKeys(password);
        locators().buttonLogin.click();
        return new InventoryPage();
    }

    @Step("Fill input \"Username\"")
    public MainPage fillInputUsername(String username) {
        locators().inputUsername.sendKeys(username);
        return this;
    }

    @Step("Fill input \"Password\"")
    public MainPage fillInputPassword(String password) {
        locators().inputPassword.sendKeys(password);
        return this;
    }

    @Step("Click on button \"LOGIN\"")
    public InventoryPage clickOnButtonLogin() {
        locators().buttonLogin.click();
        return new InventoryPage();
    }

    //Get error text with invalid authorization data
    public String getErrorTextAuthorization() {
        String errorText = locators().errorTextAuthorization.getText();
        return errorText;
    }

    private MainPageLocators locators() {
        return new MainPageLocators();
    }
}
