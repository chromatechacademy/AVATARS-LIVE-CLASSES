package com.chromatech.steps;

import com.avatars.utils.WebDriverUtils;
import io.cucumber.java.en.Given;

public class My_First_Feature_File_Steps {

    @Given("a user is on the Chroma Tech Academy practice site")
    public void a_user_is_on_the_chroma_tech_academy_practice_site() {
        WebDriverUtils.driver.get("https://chromatechacademy.net/selenium-practice/");
    }
}
