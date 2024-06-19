package com.avatars;

import java.util.List;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.avatars.utils.WebDriverUtils.driver;

public class BootstrapDropDowns {

    public static void main(String[] args) {

        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");

        WebElement dropDownOne = driver
                .findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-light']"));
        dropDownOne.click();

        // WebElement option3 = driver.findElement(By.xpath("(//label[@class='dropdown-item'])[3]/input"));
        // option3.click();

        // WebElement option4 = driver.findElement(By.xpath("//label[text()=' Option 4']"));
        // option4.click();

        CommonMethods.selectBootStrapDropDownValue("//label[@class='dropdown-item']", "Option 4");
        driver.quit();
    }
}
