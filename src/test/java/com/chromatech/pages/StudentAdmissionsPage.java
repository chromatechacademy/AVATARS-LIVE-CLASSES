package com.chromatech.pages;

import com.avatars.utils.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionsPage {

    public StudentAdmissionsPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
