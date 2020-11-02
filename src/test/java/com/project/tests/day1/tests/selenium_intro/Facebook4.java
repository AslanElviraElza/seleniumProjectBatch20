package com.project.tests.day1.tests.selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");
        String actualHeader= driver.findElement(By.tagName("a")).getText();
        String expectedHeader="registration_form";

        if(actualHeader.contains(expectedHeader)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
