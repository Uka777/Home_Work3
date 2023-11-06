package com.demoqa.pages;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.*;
import java.io.File;

public class RegistrationFromPage {

        private SelenideElement
            userName = $("#user-name"),
            passwordName = $("#password"),
            submitInput = $("#login-button");


    public RegistrationFromPage openPage() {
        open("https://www.saucedemo.com/");
        return this;
    }
    public RegistrationFromPage userName(String Value) {
        userName.setValue(Value);
        return this;
    }

    public RegistrationFromPage passwordName(String Value) {
        passwordName.setValue(Value);
        return this;
    }
    public RegistrationFromPage setSubmit() {
        submitInput.click();
        return this;
    }

}