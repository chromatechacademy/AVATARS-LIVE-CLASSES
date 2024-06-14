package com.chromatech.steps;

import com.avatars.utils.WebDriverUtils;
import com.chromatech.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class My_First_Feature_File_Steps {

    LoginPage loginPage = new LoginPage();

    @Given("a user is on the Chroma Tech Academy practice site {string}")
    public void a_user_is_on_the_chroma_tech_academy_practice_site(String url) {
        WebDriverUtils.driver.get(url);
    }

    @When("enters password {string} in password text box")
    public void enters_password_in_password_text_box(String password) {
        loginPage.passwordTextBox.sendKeys(password);
    }

    @When("clicks on Sign In button")
    public void clicks_on_sign_in_button() {
       loginPage.signInButton.click();
    }

    @When("user enters username {string} in username text box")
    public void user_enters_username_in_username_text_box(String username) {
        loginPage.usernameTextBox.sendKeys(username);
    }

    @Then("user is directed to the CTSMS dashboard page {string}")
    public void user_is_directed_to_the_ctsms_dashboard_page(String expectedURL) {
        String actualURL = WebDriverUtils.driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }
}