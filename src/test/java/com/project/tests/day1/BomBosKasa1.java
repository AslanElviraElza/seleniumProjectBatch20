package com.project.tests.day1;

import com.project.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BomBosKasa1 {
    //Selecting date on dropdown and verifying1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Select “December 1st, 1921” and verify it is selected.
    // Select year using:visible text
    // Select month using : value attribute
    // Select day using: index number

    WebDriver driver;

    @BeforeMethod

    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void selectDate(){
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("1921");
        String actualYear = selectYear.getFirstSelectedOption().getText();
        String expectedResult = "1921";
        Assert.assertEquals(actualYear, expectedResult, "1921 is not found");

        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("11");
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        String expectedSelectedMonth = "December";
        Assert.assertEquals(actualMonth, expectedSelectedMonth, "December not Found");

        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByValue("1");
        String actualDay = selectDay.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay, expectedDay, "1st day is not found");
    }
}
