package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.avatars.utils.CommonMethods.alert;
import static com.avatars.utils.CommonMethods.driver;

public class AlertsAndModalDialogs {

    public static void main(String[] args) {

        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        WebElement alertButton = driver.findElement(By.xpath("//input[@value='Alert']"));
        CommonMethods.scrollIntoView(alertButton);
        alertButton.click();
        CommonMethods.acceptAlert();
        WebElement confirmButton = driver.findElement(By.xpath("//input[@value='Confirm']"));
        confirmButton.click();
        System.out.println("TEXT OF ALERT IS: " + alert.getText());
        alert.dismiss();
        driver.quit();
    }
}
