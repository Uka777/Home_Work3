package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.tracing.EventAttributeValue;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class PracticeTest {
   @BeforeAll static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize ="1920x1080";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void fillFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Julija");
        $("#lastName").setValue("Ivanova");
        $("#userEmail").setValue("Ivanova@mail.ru");
        $("#genterWrapper").$(byText("Female")).click();
        $("#userNumber").setValue("89195577328");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__year-select").selectOption("1997");
        $(".react-datepicker__day--004").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/kotik.jpg"));
        $("#currentAddress").setValue("Sovetskaya");

        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Gurgaon")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Julija Ivanova"),
                text("Ivanova@mail.ru"),
                text("Female"),
                text("8919557732"),
                text("04 March,1997"),
                text("English"),
                text("Music"),
                text("kotik.jpg"),
                text("Sovetskaya"),
                text("NCR Gurgaon"));
    }


}
