package com.project.tests.day1;

import com.project.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BomBosKasa {
//Selecting state from State dropdown and verifyingresult1.Open Chrome browser
// 2.Go to http://practice.cybertekschool.com/dropdown
// 3.Select Illinois
// 4.Select Virginia
// 5.Select California
// 6.Verify final selected option is California.
// Use all Select options.(visible text, value, index)
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void StateDropdownVerification() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select simpleDropdown = new Select(driver.findElement(By.id("state")));
        Thread.sleep(2000);

        simpleDropdown.selectByVisibleText("Illinois");
        String actualSelectedState = simpleDropdown.getFirstSelectedOption().getText();
        String expectedResult = "Illinois";
        Assert.assertTrue(actualSelectedState.equals(expectedResult), "Illinois verification FAILED!!");

        Thread.sleep(2000);
        simpleDropdown.selectByVisibleText("Virginia");
        String actualSelectedState1 = simpleDropdown.getFirstSelectedOption().getText();
        String expectedResult1 = "Virginia";
        Assert.assertTrue(actualSelectedState1.equals(expectedResult1),"Virginia verification FAILED!!");

        Thread.sleep(2000);
        simpleDropdown.selectByVisibleText("California");
        String actualSelectedState2 = simpleDropdown.getFirstSelectedOption().getText();
        String expectedResult2 = "California";
        Assert.assertTrue(actualSelectedState2.equals(expectedResult2), "California verification FAILED!");

    }
}



