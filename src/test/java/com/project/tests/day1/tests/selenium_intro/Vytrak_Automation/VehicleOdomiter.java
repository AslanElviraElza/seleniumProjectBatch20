package com.project.tests.day1.tests.selenium_intro.Vytrak_Automation;

import com.project.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VehicleOdomiter {
    //#Smoke/Regression
    // AC2.1 Verify that Sales Managers can NOT access Vehicle Odometer page
    //Given the Sales Manager is on Vytrack home page
    //Given the Sales Manager is on Vytrack home page
    // When user clicks on “Fleet” module
    // And user selects “Vehicle Odometer”
    // Then user receives message “You do not have permission to perform this action.”
    // Sales Manager: salesmanager267
    // Password: UserUser123

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void AccessToOdometer()throws InterruptedException{
        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.xpath("//input[@name='_username']")).sendKeys("salesmanager267");
        driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
        driver.findElement(By.xpath("//button[@name='_submit']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[2]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//span[.='Vehicle Odometer']")).click();


        WebElement odometer = driver.findElement(By.xpath("//span[.='Vehicle Odometer']"));
        Thread.sleep(3000);
        odometer.click();
        WebElement notHavePermission= driver.findElement(By.xpath("//div[.='You do not have permission to perform this action.']"));
        Thread.sleep(5000);
        Assert.assertTrue(notHavePermission.isDisplayed(),"You do not have permission to perform this action message is not displayed,FAILED!!");

    }
}
