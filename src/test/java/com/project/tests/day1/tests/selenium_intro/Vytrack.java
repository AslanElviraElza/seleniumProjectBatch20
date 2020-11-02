package com.project.tests.day1.tests.selenium_intro;

import com.project.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Vytrack {

    WebDriver driver;
    @BeforeClass
    public void setUp()throws InterruptedException{
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

   @Test
public void VyTrackLogIn()throws  InterruptedException{
        driver.get("https://app.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager267");
        Thread.sleep(2000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();
        Thread.sleep(2000);
    }

    @Test
    public void TS1(){
    driver.findElement(By.xpath("dropdown dropdown-level-1")).click();
    driver.findElement(By.xpath("dropdown-menu-single-item")).click();
    }
}
