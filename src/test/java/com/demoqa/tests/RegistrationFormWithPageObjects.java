package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFromPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.tracing.EventAttributeValue;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class  RegistrationFormWithPageObjects {
    RegistrationFromPage registrationFromPage = new RegistrationFromPage();

    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }

    @Test
    void fillFormTests() {
        registrationFromPage.openPage()
                .SetFirstName("Julija")
                .SetLastName("Ivanova")
                .SetEmail("Ivanova@mail.ru")
                .SetGender("Female")
                .SetNumber("89195577328")
                .SetBirthDay("04","March", "1997")
                .SetSubjects("English")
                .SetHobbies("Music")
                .UploadPicture("src/test/resources/kotik.jpg")
                .setAdress("Sovetskaya")
                .clickState()
                .setState("NCR")
                .clickCity()
                .setCity("Gurgaon")
                .setSubmit()
                .checkResultsTableVisible()
                .checkResult("Student Name","Julija Ivanova");
    }
    @Test
    void fillFormMinimumTest() {
        registrationFromPage.openPage()
                .SetFirstName("Julija")
                .SetLastName("Ivanova")
                .SetGender("Female")
                .SetNumber("89195577328")
                .SetBirthDay("04","March", "1997")
                .setSubmit()
                .checkResultsTableVisible()
                .checkResult("Student Name","Julija Ivanova");
    }
}