package com.project.tests.day1.tests.selenium_intro;

import com.project.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class selectLanguage {


    WebDriver driver;

    @BeforeMethod
    public void SetUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void SelectValue() {
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select selectLanguage = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));

        List<WebElement> selectLanguageOptions = selectLanguage.getOptions();
        for (WebElement each : selectLanguageOptions) {
            System.out.println(each.getText());
        }
    }
}