package com.chromatech.pages;

import com.avatars.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BulkDeletePage {

    /**
     * Finds and returns the WebElement of the dynamic delete record locator based on the provided text.
     *
     * @param text the text to be searched for in the record locator
     * @return the WebElement that represents the delete record locator
     */
    public static WebElement dynamicDeleteRecordLocator(String text){
        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'"+ text + "')]//parent::tr/td/input"));
    }

    public BulkDeletePage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
