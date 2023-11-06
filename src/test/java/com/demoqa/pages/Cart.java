package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Cart {
    private SelenideElement
            checkOut = $("#checkout");
    public Cart checkOut() {
        checkOut.click();
        return this;
    }

}
