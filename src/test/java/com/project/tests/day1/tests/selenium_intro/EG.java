package com.project.tests.day1.tests.selenium_intro;

import com.project.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EG {


    WebDriver driver;

    @BeforeMethod
    public void SetUpM(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public  void selectValue() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/dropdown");
        driver.findElement(By.partialLinkText("Cybertek Sc")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div/div[2]/div[1]/div/a[2]")).click();

    }
}
