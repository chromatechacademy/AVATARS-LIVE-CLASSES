package com.chromatech.steps;

import com.avatars.utils.CommonMethods;
import com.avatars.utils.WebDriverUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class My_First_Feature_File_Steps {

    @Given("a user is on the Chroma Tech Academy practice site")
    public void a_user_is_on_the_chroma_tech_academy_practice_site() {
        WebDriverUtils.driver.get("https://chroma.mexil.it/site/login");
    }

    @When("enters password in password text box")
    public void enters_password_in_password_text_box() {
      WebElement passwordTextBox = WebDriverUtils.driver.findElement(By.xpath("//input[@id='form-password']"));
      passwordTextBox.sendKeys("123456");
    }

    @When("clicks on Sign In button")
    public void clicks_on_sign_in_button() {
       WebElement signInButton = WebDriverUtils.driver.findElement(By.xpath("//button[@type='submit']"));
       signInButton.click();
       CommonMethods.sleep(3000);
    }

    @Then("user is directed to the CTSMS dashboard page")
    public void user_is_directed_to_the_ctsms_dashboard_page() {
        String actualURL = WebDriverUtils.driver.getCurrentUrl();
        String expectedURL = "https://mexil.it/chroma/admin/admin/dashboard";
        Assert.assertEquals(actualURL, expectedURL);
    }

    @When("user enters username {string} in username text box")
    public void user_enters_username_in_username_text_box(String username) {
        WebElement usernameTextBox = WebDriverUtils.driver.findElement(By.xpath("//input[@id='form-username']"));
        usernameTextBox.sendKeys(username);
    }

}
