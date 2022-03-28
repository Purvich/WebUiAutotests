package com.saucedemo.base;

import static com.codeborne.selenide.Selenide.open;

public class BaseView {

    public Object openSite(String url) {
        open(url);
        return this;
    }
}
