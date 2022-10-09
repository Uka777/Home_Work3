package com.demoqa.pages;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.pages.components.ResultsTableComponent;

import static com.codeborne.selenide.Selenide.*;
import java.io.File;

public class RegistrationFromPage {
    //Элементы
    private ResultsTableComponent resultsTableComponent = new ResultsTableComponent();
    private CalendarComponent calendarComponent = new CalendarComponent();
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderInput = $("#genterWrapper"),
            numberInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbiesInput = $("#hobbiesWrapper"),
            pictureUpload = $("#uploadPicture"),
            adressInput =  $("#currentAddress"),
            clickstateInput = $("#state"),
            statecityInput = $("#stateCity-wrapper"),
            clickcityInput = $("#city"),
            cityInput = $("#stateCity-wrapper"),
            submitInput = $("#submit");
    //Действия
    public RegistrationFromPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }
    public RegistrationFromPage SetFirstName(String Value) {
        firstNameInput.setValue(Value);
        return this;
    }
    public RegistrationFromPage ClearFirstName() {
        firstNameInput.clear();
        return this;
    }
    public RegistrationFromPage SetLastName(String Value) {
        lastNameInput.setValue(Value);
        return this;
    }
    public RegistrationFromPage SetEmail(String Value) {
        emailInput.setValue(Value);
        return this;
    }
    public RegistrationFromPage SetGender(String Value) {
        genderInput.$(byText(Value)).click();
        return this;
    }
    public RegistrationFromPage SetNumber(String Value) {
        numberInput.setValue(Value);
        return this;
    }
    public RegistrationFromPage SetBirthDay(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.SetDate(day, month, year);
        return this;
    }
    public RegistrationFromPage SetSubjects(String Value) {
        subjectsInput.setValue(Value).pressEnter();
        return this;
    }
    public RegistrationFromPage SetHobbies(String Value) {
        hobbiesInput.$(byText(Value)).click();
        return this;
    }
    public RegistrationFromPage UploadPicture(String Value) {
        pictureUpload.uploadFile(new File(Value));
        return this;
    }
    public RegistrationFromPage setAdress(String Value) {
        adressInput.setValue(Value);
        return this;
    }
    public RegistrationFromPage clickState() {
        clickstateInput.click();
        return this;
    }
    public RegistrationFromPage setState(String Value) {
        statecityInput.$(byText(Value)).click();
        return this;
    }
    public RegistrationFromPage clickCity() {
        clickcityInput.click();
        return this;
    }
    public RegistrationFromPage setCity(String Value) {
        cityInput.$(Value).click();
        return this;
    }
    public RegistrationFromPage setSubmit() {
        submitInput.click();
        return this;
    }
    public RegistrationFromPage checkResultsTableVisible() {
        resultsTableComponent.checkVisible();
        return this;
    }
    public RegistrationFromPage checkResult(String key, String value) {
        resultsTableComponent.checkResult(key, value);
        return this;
    }
}