package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static com.avatars.utils.CommonMethods.wait;
import static com.avatars.utils.WebDriverUtils.driver;

public class WaitsPractice {

    public static void main(String[] args) {
        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-explicit-wait-practice/");
        WebElement alertButton = driver.findElement(By.xpath("//button[normalize-space()='Click me to open an Alert after 5 seconds']"));
        alertButton.click();
        CommonMethods.waitForAlertToBePresent();

        // HANDLING ALERT
        driver.switchTo().alert().accept();

        // WAITING FOR SELENIUM TEXT TO DISPLAY
        WebElement seleniumTextButton = driver.findElement(By.xpath("//button[normalize-space()='Change Text to Selenium Webdriver']"));
        seleniumTextButton.click();
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2[@class='target-text']")),"Selenium Webdriver" ));

        // WAITING FOR BUTTON TO DISPLAY
        WebElement displayButton = driver.findElement(By.xpath("//button[normalize-space()='Display button after 10 seconds']"));
        displayButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Enabled']")));

        // CHECK CHECKBOX AFTER TEN SECONDS
        WebElement checkbox = driver.findElement(By.xpath("//button[normalize-space()='Check Checkbox after 10 seconds']"));
        checkbox.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));

        driver.quit();
    }
}