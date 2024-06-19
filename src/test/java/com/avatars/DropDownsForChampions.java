package com.avatars;

import java.util.List;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.avatars.utils.WebDriverUtils.driver;


public class DropDownsForChampions {

    public static void main(String[] args) {

        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        WebElement dropDown = driver.findElement(By.xpath("//input[@class='choices__input choices__input--cloned']"));
        dropDown.click();
        CommonMethods.selectBootStrapDropDownValue("//div[@class='choices__item choices__item--choice choices__item--selectable']","CSS");
        driver.quit();
    }
}