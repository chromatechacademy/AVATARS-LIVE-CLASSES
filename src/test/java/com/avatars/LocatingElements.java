package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.avatars.utils.WebDriverUtils.driver;

public class LocatingElements {

    public static void main(String[] args) {

        CommonMethods.openChromeBrowserAndNavigateToSite("https://chroma.mexil.it/site/login");

        // ----- Locating element by 'ID' ------
        // WebElement usernameTextBox = driver.findElement(By.id("form-username"));
        // usernameTextBox.sendKeys("general@teacher.com");

        // ------ Locating element by 'Name' -----
        // WebElement usernameTextBox = driver.findElement(By.name("username"));
        // usernameTextBox.sendKeys("general@teacher.com");
        // usernameTextBox.clear();

        // ------ Locating element by tag name ------ DID NOT WORK
        // Thread.sleep(2000);
        // WebElement usernameTextBox = driver.findElement(By.tagName("input"));
        // usernameTextBox.sendKeys("general@teacher.com");

        // ------ Locating using CSS Selector -----
        // WebElement usernameTextBox =
        // driver.findElement(By.cssSelector("input[class='form-username
        // form-control']"));
        // usernameTextBox.sendKeys("general@teacher.com");

        // ---- Locating using absolute xpath ----
        // WebElement usernameTextBox = driver
        //         .findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/form/div[1]/input"));
        // usernameTextBox.sendKeys("general@teacher.com");

        // --- Locating using relative xpath ---
        WebElement usernameTextBox = driver.findElement(By.xpath("//input[@type='text']"));
        usernameTextBox.sendKeys("general@teacher.com");

        driver.quit();
    }
}