package com.project.tests.day1.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com");
        String actualHeader=driver.findElement(By.tagName("h2")).getText();

        String expectedHeader="Connect with friends and the world around you on Facebook";

        if(actualHeader.equalsIgnoreCase(expectedHeader)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

    }
}
