package com.project.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.facebook.com");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("Orientalion@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("AslanDemir1243");

        String expectedTitle= "Log into Facebook | Facebook";
        String actualTitle = driver.getTitle();

        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
    }
}
