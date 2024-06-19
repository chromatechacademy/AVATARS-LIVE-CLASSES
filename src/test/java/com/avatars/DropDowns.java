package com.avatars;

import java.util.List;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static com.avatars.utils.WebDriverUtils.driver;

public class DropDowns {

    public static void main(String[] args) {

        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");

        WebElement multiSelectDropDown = driver
                .findElement(By.xpath("//*[@id='content']/div[1]/div[2]/fieldset/select"));

        CommonMethods.selectDropDownValueByIndex(multiSelectDropDown, 4);
        CommonMethods.selectDropDownValueByIndex(multiSelectDropDown, 1);
        CommonMethods.selectDropDownValueByIndex(multiSelectDropDown, 12);

        List<WebElement> options = driver
                .findElements(By.xpath("//body[@id='content']/div[1]/div[2]/fieldset/select/option"));

        int numberOfOptions = options.size();
        System.out.println("NUMBER OF OPTIONS: " + numberOfOptions);

        for(WebElement option : options){
           String actualText = option.getText();
           System.out.println(actualText);
        }

        driver.quit();
        
    }

}
