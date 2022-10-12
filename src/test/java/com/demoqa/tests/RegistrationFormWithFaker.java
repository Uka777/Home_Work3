package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import com.demoqa.pages.RegistrationFromPage;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RegistrationFormWithFaker {
    Faker faker = new Faker();
    public String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String email = faker.internet().emailAddress();
    String number = faker.phoneNumber().subscriberNumber(10);
    String streetAddress = faker.address().streetAddress();
    String day = String.valueOf(faker.number().numberBetween(1,28));
    String year = String.valueOf(faker.number().numberBetween(1990,2007));
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
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender("Female")
                .setNumber(number)
                .setBirthDay(day,"March", year)
                .setSubjects("English")
                .setHobbies("Music")
                .uploadPicture("src/test/resources/kotik.jpg")
                .setAdress(streetAddress)
                .clickState()
                .setState("NCR")
                .clickCity()
                .setCity("Delhi")
                .setSubmit()
                .checkResultsTableVisible()
                .checkResult("Student Name",firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender", "Female")
                .checkResult("Mobile", number)
                .checkResult("Subjects", "English")
                .checkResult("Hobbies", "Music")
                .checkResult("Picture", "bez-nazvanija.jpeg")
                .checkResult("Address", streetAddress)
                .checkResult("State and City", "NCR Delhi");
    }
    @Test
    void fillFormMinimumTest() {
        registrationFromPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender("Female")
                .setNumber(number)
                .setSubmit()
                .checkResultsTableVisible()
                .checkResult("Student Name",firstName + " " + lastName);
    }
}

