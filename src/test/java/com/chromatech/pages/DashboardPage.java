package com.chromatech.pages;

import com.avatars.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    /* STUDENT INFORMATION MODULE */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /* STUDENT ADMISSION SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubModule;

    /* BULK DELETE SUB MODULE */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteSubModule;

    public DashboardPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
