package com.chromatech.steps;

import com.avatars.utils.CommonMethods;
import com.chromatech.pages.DashboardPage;
import io.cucumber.java.en.When;

public class Student_Admission_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks on Student Information module")
    public void user_clicks_on_student_information_module() {
        dashboardPage.studentInformationModule.click();
    }

    @When("clicks on Student Admission sub module")
    public void clicks_on_student_admission_sub_module() {
        dashboardPage.studentAdmissionSubModule.click();
    }

    @When("enters Unique Admission Number")
    public void enters_unique_admission_number() {

    }
}
