package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Inventory {
    private SelenideElement
            backPack = $(".btn.btn_primary.btn_small.btn_inventory"),
            bike = $(".btn.btn_primary.btn_small.btn_inventory"),
            bolt = $(".btn.btn_primary.btn_small.btn_inventory"),
            fleece = $(".btn.btn_primary.btn_small.btn_inventory"),
            oneSize = $(".btn.btn_primary.btn_small.btn_inventory"),
            shirt = $(".shopping_cart_link");

    public Inventory backPack() {
        backPack.click();
        return this;
    }

    public Inventory bike() {
        bike.click();
        return this;
    }
    public Inventory  bolt() {
        bolt.click();
        return this;
    }
    public Inventory  fleece() {
        fleece.click();
        return this;
    }
    public Inventory  oneSize() {
        oneSize.click();
        return this;
    }
    public Inventory  shirt() {
        shirt.click();
        return this;
    }
}
