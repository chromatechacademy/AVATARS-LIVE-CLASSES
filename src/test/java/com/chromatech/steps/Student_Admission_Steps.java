package com.chromatech.steps;

import com.avatars.utils.CommonMethods;
import com.chromatech.pages.DashboardPage;
import com.chromatech.pages.StudentAdmissionsPage;
import io.cucumber.java.en.When;

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

    @When("selects SDET for class drop down")
    public void selects_sdet_for_class_drop_down() {
        CommonMethods.selectDropDownValueByVisibleText();
    }
}