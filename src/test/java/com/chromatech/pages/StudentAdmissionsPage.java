package com.chromatech.pages;

import com.avatars.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionsPage {

    /* ADMISSION NUMBER TEXT BOX */
    @FindBy(xpath = "//input[@name='admission_no']")
    public WebElement admissionNumberTextBox;

    /* CLASS DROP DOWN */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    public StudentAdmissionsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
