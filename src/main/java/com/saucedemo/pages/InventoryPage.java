package com.saucedemo.pages;

import com.saucedemo.locators.InventoryPageLocators;
import io.qameta.allure.Step;

public class InventoryPage {

    //Get text label products
    public String getLabelTextProducts() {
        String labelTextProducts;
        labelTextProducts = locators().productsLabel.getText();
        return labelTextProducts;
    }

    @Step("Add \"Sauce Labs Backpack\" in cart")
    public InventoryPage clickOnButtonAddToCartForSauceLabsBackpack() {
        locators().buttonAddToCartSauceLabsBackpack.click();
        return this;
    }

    @Step("Go to \"Your cart\"")
    public CartPage goToCartPage() {
        locators().shoppingCart.click();
        return new CartPage();
    }

    private InventoryPageLocators locators() {
        return new InventoryPageLocators();
    }
}
