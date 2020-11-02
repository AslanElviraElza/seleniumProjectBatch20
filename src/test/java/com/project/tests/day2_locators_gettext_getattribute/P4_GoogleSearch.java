package com.project.tests.day2_locators_gettext_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {


        //TC #4: Google search
        //1- Open a chrome browser
        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open chrome browser
        WebDriver driver = new ChromeDriver();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        //3- Write “apple” in search box
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with “apple” word


    }
}
