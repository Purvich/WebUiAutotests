package com.saucedemo.authorization;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.MainPage;
import com.saucedemo.params.AssertionsData;
import com.saucedemo.params.LoginData;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

@Story("Authorization")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AuthorizationTest extends BaseTest {

    @Test
    @Description("Check success authorization")
    @DisplayName("Check success authorization")
    @Order(1)
    void checkSuccessAuthorizationWithStandardUser() {
        new MainPage()
                .fillInputUsername(LoginData.STANDARD_USERNAME)
                .fillInputPassword(LoginData.PASSWORD)
                .clickOnButtonLogin();

        Assertions.assertEquals(AssertionsData.TEXT_NAME_LABEL_PRODUCTS, new InventoryPage().getLabelTextProducts());
    }

    @Test
    @Description("Check authorization for locked user")
    @DisplayName("Check authorization for locked user")
    @Order(2)
    void checkAuthorizationForLockedUser() {
        new MainPage()
                .fillInputUsername(LoginData.LOCKED_OUT_USERNAME)
                .fillInputPassword(LoginData.PASSWORD)
                .clickOnButtonLogin();

        Assertions.assertEquals(AssertionsData.ERROR_TEXT_FOR_LOCKED_USER, new MainPage().getErrorTextAuthorization());
    }

    @Test
    @Description("Check authorization with empty field \"Login\"")
    @DisplayName("Check authorization with empty field \"Login\"")
    @Order(3)
    void checkAuthorizationWithEmptyLoginField() {
        new MainPage()
                .fillInputPassword(LoginData.PASSWORD)
                .clickOnButtonLogin();

        Assertions.assertEquals(AssertionsData.ERROR_TEXT_FOR_EMPTY_LOGIN_INPUT,
                new MainPage().getErrorTextAuthorization());
    }

    @Test
    @Description("Check authorization with empty field \"Password\"")
    @DisplayName("Check authorization with empty field \"Password\"")
    @Order(4)
    void checkAuthorizationWithEmptyPasswordField() {
        new MainPage()
                .fillInputUsername(LoginData.PROBLEM_USERNAME)
                .clickOnButtonLogin();

        Assertions.assertEquals(AssertionsData.ERROR_TEXT_FOR_EMPTY_PASSWORD_INPUT,
                new MainPage().getErrorTextAuthorization());
    }
}
