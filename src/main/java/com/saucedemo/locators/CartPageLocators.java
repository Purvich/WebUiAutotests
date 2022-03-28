package com.saucedemo.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartPageLocators {

    public SelenideElement itemName = $(By.xpath("//div[@class=\"inventory_item_name\"]"));
}
