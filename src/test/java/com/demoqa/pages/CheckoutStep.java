package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutStep {
    private SelenideElement
            firstName = $("#first-name"),
            lastName = $("#last-name"),
            zip = $("#postal-code"),
            cont = $("#continue");

    public CheckoutStep firstName(String Value) {
        firstName.setValue(Value);
        return this;
    }

    public CheckoutStep lastName(String Value) {
        lastName.setValue(Value);
        return this;
    }

    public CheckoutStep zip(String Value) {
        zip.setValue(Value);
        return this;
    }
    public CheckoutStep cont() {
        cont.click();
        return this;
    }
}