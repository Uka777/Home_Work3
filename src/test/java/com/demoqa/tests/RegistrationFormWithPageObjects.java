package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.pages.*;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.tracing.EventAttributeValue;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.attachment;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class  RegistrationFormWithPageObjects {
    RegistrationFromPage registrationFromPage = new RegistrationFromPage();
    Inventory inventory = new Inventory();
    Cart cart = new Cart();
    CheckoutStep checkoutStep = new CheckoutStep();
    CheckoutStepTwo checkoutStepTwo = new CheckoutStepTwo();

    @BeforeAll
    static void setUp() {
        SelenideLogger.addListener("allure",new AllureSelenide());
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void fillFormTests() {
        registrationFromPage.openPage()
                .userName("standard_user")
                .passwordName("secret_sauce")
                .setSubmit();

    }
    @Test
    void fillFormTests2() {
            inventory.backPack()
                    .bike()
                    .backPack()
                    .bolt()
                    .fleece()
                    .oneSize()
                    .shirt();
        }
    @Test
    void fillFormTests3() {
        cart.checkOut();
    }
    @Test
    void fillFormTests4() {
        checkoutStep.firstName("Julija")
                .lastName("Test")
                .zip("777")
                .cont();
    }
    @Test
    void fillFormTests5() {
        checkoutStepTwo.total();

    }

}