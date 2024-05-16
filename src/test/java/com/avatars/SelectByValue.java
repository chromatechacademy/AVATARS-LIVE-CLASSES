package com.avatars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chromatechacademy.net/selenium-practice/";

        driver.get(url);

        WebElement multiSelectDropDown = driver
                .findElement(By.xpath("//*[@id='content']/div[1]/div[2]/fieldset/select"));
        Select select = new Select(multiSelectDropDown);

        select.selectByVisibleText("CSS");
        select.selectByValue("Jquery");

        Thread.sleep(2000);
        select.deselectAll();
        Thread.sleep(2000);

        select.selectByVisibleText("HTML");
        select.selectByVisibleText("Bootstrap 3");

       List<WebElement> selectedOptions = select.getAllSelectedOptions();
       
       for(WebElement selectedOption : selectedOptions){
            System.out.println("SELECTED OPTION: " + selectedOption.getText());
       }
    }
}
