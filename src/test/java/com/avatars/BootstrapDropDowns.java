package com.avatars;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDowns {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chromatechacademy.net/selenium-practice/";

        driver.get(url);

        WebElement dropDownOne = driver
                .findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-light']"));

        dropDownOne.click();

       // WebElement option3 = driver.findElement(By.xpath("(//label[@class='dropdown-item'])[3]/input"));
       // option3.click();

       // WebElement option4 = driver.findElement(By.xpath("//label[text()=' Option 4']"));
       // option4.click();


       List<WebElement> options = driver.findElements(By.xpath("//label[@class='dropdown-item']"));

       for(WebElement option : options){
          //  System.out.println(option.getText());
            if(option.getText().equals("Option 4")){
                option.click();
                break;
            }
       }

    }
}
