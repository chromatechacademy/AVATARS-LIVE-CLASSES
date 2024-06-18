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

    /* SECTION DROP DOWN */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    /* FIRST NAME TEXT BOX */
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;

    /* LAST NAME TEXT BOX */
    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameTextBox;

    /* GENDER DROP DOWN */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    /* DATE OF BIRTH TEXT BOX */
    @FindBy(xpath = "//input[@name='dob']")
    public WebElement dateOfBirthTextBox;

    /* FATHER NAME TEXT BOX */
    @FindBy(xpath = "//input[@name='father_name']")
    public WebElement fatherNameTextBox;

    public StudentAdmissionsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
