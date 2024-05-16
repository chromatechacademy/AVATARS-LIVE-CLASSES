package com.avatars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chromatechacademy.net/selenium-practice/";

        driver.get(url);

        WebElement multiSelectDropDown = driver
                .findElement(By.xpath("//*[@id='content']/div[1]/div[2]/fieldset/select"));
        Select select = new Select(multiSelectDropDown);

        select.selectByIndex(4);
        select.selectByIndex(1);
        select.selectByIndex(12);

        List<WebElement> options = driver
                .findElements(By.xpath("//body[@id='content']/div[1]/div[2]/fieldset/select/option"));

        int numberOfOptions = options.size();
        System.out.println("NUMBER OF OPTIONS: " + numberOfOptions);

        for(WebElement option : options){
           String actualText = option.getText();
           System.out.println(actualText);
        }
        
    }

}
