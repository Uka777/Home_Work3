package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutStepTwo {
    private SelenideElement
            total = $(".summary_info_label.summary_total_label");
    public CheckoutStepTwo total() {
        total.shouldHave(text("140.34"));
        return this;
    }

}
