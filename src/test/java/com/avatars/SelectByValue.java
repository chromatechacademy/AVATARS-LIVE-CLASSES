package com.avatars;

import java.util.List;
import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.avatars.utils.CommonMethods.driver;
import static com.avatars.utils.CommonMethods.select;

public class SelectByValue {

    public static void main(String[] args) {
        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        WebElement multiSelectDropDown = driver
                .findElement(By.xpath("//*[@id='content']/div[1]/div[2]/fieldset/select"));
        CommonMethods.selectDropDownValueByVisibleText(multiSelectDropDown, "CSS");
        CommonMethods.selectDropDownValueByValue(multiSelectDropDown, "Jquery");
        select.deselectAll();
        CommonMethods.selectDropDownValueByVisibleText(multiSelectDropDown, "HTML");
        CommonMethods.selectDropDownValueByVisibleText(multiSelectDropDown, "Bootstrap 3");
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement selectedOption : selectedOptions) {
            System.out.println("SELECTED OPTION: " + selectedOption.getText());
        }
        driver.quit();
    }
}
