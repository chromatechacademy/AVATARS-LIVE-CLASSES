package com.avatars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownsForChampions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chromatechacademy.net/selenium-practice/";
        driver.get(url);

        WebElement dropDown = driver.findElement(By.xpath("//input[@class='choices__input choices__input--cloned']"));

        dropDown.click();

        List<WebElement> options = driver.findElements(
                By.xpath("//div[@class='choices__item choices__item--choice choices__item--selectable']"));

        for (WebElement option : options) {

            if (option.getText().equals("CSS")) {
                option.click();
                break;
            }
        }
    }

}
