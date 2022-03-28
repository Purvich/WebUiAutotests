package com.saucedemo.pages;

import com.saucedemo.locators.CartPageLocators;

public class CartPage {

    public CartPage getItemName() {
        locators().itemName.getText();
        return this;
    }

    private CartPageLocators locators() {
        return new CartPageLocators();
    }
}
