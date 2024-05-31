package com.avatars;

import com.avatars.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static com.avatars.utils.CommonMethods.driver;

public class FindElementVsFindElements {

    public static void main(String[] args) {

        CommonMethods.openChromeBrowserAndNavigateToSite("https://chromatechacademy.net/selenium-practice/");
        boolean flag = driver.findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-light']")).isDisplayed();
        System.out.println("IS DROPDOWN DISPLAYED: " + flag);
        List<WebElement> list = driver.findElements(By.xpath("//*[@value='asdfasdfasdfasdf']"));
        System.out.println("Number of elements found: " + list.size());
        driver.quit();
    }
}