package com.demoqa;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.open;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;



public class PracticeTest {
    @BeforeAll static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }
    @Test void fillPracticeTest() {
        open("/automation-practice-form");
    }


}
