package com.saucedemo.addInventoryInCart;

import com.saucedemo.base.BaseTest;
import com.saucedemo.locators.CartPageLocators;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.MainPage;
import com.saucedemo.params.LoginData;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AddInventoryInCartTest extends BaseTest {

    @Test
    @DisplayName("Add \"Sauce labs backpack\" in cart")
    @Order(1)
    public void addSauceLabsBackpackInCart() {
        new MainPage()
                .authorization(LoginData.STANDARD_USERNAME, LoginData.PASSWORD);
        new InventoryPage()
                .clickOnButtonAddToCartForSauceLabsBackpack()
                .goToCartPage();

        Assertions.assertEquals("Sauce Labs Backpack", new CartPageLocators().itemName.getText());
    }
}
