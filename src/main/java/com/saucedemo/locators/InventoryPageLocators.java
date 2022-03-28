package com.saucedemo.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class InventoryPageLocators {

    //Products label
    public SelenideElement productsLabel = $(By.className("title"));

    //Button "Add To Cart" for Sauce Labs Backpack
    public SelenideElement buttonAddToCartSauceLabsBackpack = $(By.name("add-to-cart-sauce-labs-backpack"));

    //Label "Your cart"
    public SelenideElement labelYourCart = $(By.xpath("//a[@class=\"shopping_cart_link\"]"));

    //Label shopping cart
    public SelenideElement shoppingCart = $(By.xpath("//a[@class=\"shopping_cart_link\"]"));
}
