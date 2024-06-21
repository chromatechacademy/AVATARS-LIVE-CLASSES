package com.chromatech.steps;

import com.avatars.utils.CommonMethods;
import com.avatars.utils.WebDriverUtils;
import com.chromatech.pages.DashboardPage;
import com.chromatech.pages.StudentAdmissionsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class Student_Admission_Steps {

    DashboardPage dashboardPage = new DashboardPage();
    StudentAdmissionsPage studentAdmissionsPage = new StudentAdmissionsPage();

    @When("user clicks on Student Information module")
    public void user_clicks_on_student_information_module() {
        dashboardPage.studentInformationModule.click();
    }

    @When("clicks on Student Admission sub module")
    public void clicks_on_student_admission_sub_module() {
        dashboardPage.studentAdmissionSubModule.click();
    }

    @When("enters Unique Admission Number {string}")
    public void enters_unique_admission_number(String admissionNumber) {
        studentAdmissionsPage.admissionNumberTextBox.sendKeys(admissionNumber);
    }

    @When("selects {string} for class drop down")
    public void selects_for_class_drop_down(String text) {
        CommonMethods.selectDropDownValueByVisibleText(studentAdmissionsPage.classDropDown, text);
    }

    @When("selects {string} for section drop down")
    public void selects_for_section_drop_down(String text) {
        CommonMethods.selectDropDownValueByVisibleText(studentAdmissionsPage.sectionDropDown, text);
    }

    @When("enters first name {string}")
    public void enters_first_name(String firstName) {
        studentAdmissionsPage.firstNameTextBox.sendKeys(firstName);
    }

    @When("enters last name {string}")
    public void enters_last_name(String lastName) {
        studentAdmissionsPage.lastNameTextBox.sendKeys(lastName);
    }

    @When("selects {string} from gender drop down")
    public void selects_from_gender_drop_down(String gender) {
        CommonMethods.selectDropDownValueByVisibleText(studentAdmissionsPage.genderDropDown, gender);
    }

    @When("selects {string} for Date of Birth Calendar")
    public void selects_for_date_of_birth_calendar(String dateOfBirth) {
        CommonMethods.selectDateByJS(dateOfBirth, studentAdmissionsPage.dateOfBirthTextBox);
    }

    @When("enters father name {string}")
    public void enters_father_name(String fatherName) {
        studentAdmissionsPage.fatherNameTextBox.sendKeys(fatherName);
    }

    @When("selects Father radio button for If guardian is field")
    public void selects_father_radio_button_for_if_guardian_is_field() {
        CommonMethods.scrollIntoView(studentAdmissionsPage.fatherRadioButton);
        studentAdmissionsPage.fatherRadioButton.click();
    }

    @When("saves submission")
    public void saves_submission() {
        studentAdmissionsPage.saveButton.click();
    }

    @When("enters guardian phone number {string}")
    public void enters_guardian_phone_number(String phoneNumber) {
        studentAdmissionsPage.guardianPhoneTextBox.sendKeys(phoneNumber);
    }

//    @Then("test account is reset {string}")
//    public void test_account_is_reset(String admissionNumber) {
//        dashboardPage.bulkDeleteSubModule.click();
//    }

    @Then("test account is reset with admission number {string}, class {string}, section {string}")
    public void test_account_is_reset_with_admission_number_class_section(String admissionNumber, String className, String sectionName) {
        dashboardPage.bulkDeleteSubModule.click();
    }
}