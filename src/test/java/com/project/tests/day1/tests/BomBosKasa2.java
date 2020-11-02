package com.project.tests.day1.tests;

import com.project.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//1. Open Chrome browser
//2. Go to http://practice.cybertekschool.com/dropdown
//3. Click to non-select dropdown
//4. Select Facebook from dropdown
//5. Verify title is “Facebook - Log In or Sign Up”
public class BomBosKasa2 {

    WebDriver driver;

    @BeforeMethod
    public void SetUpM(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public  void selectValue(){

         driver.get("http://practice.cybertekschool.com/dropdown");
         driver.findElement(By.id("dropdownMenuLink")).click();
         WebElement facebook = driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[4]"));
         facebook.click();

        String actualResult = driver.getTitle();
        String expectedResult = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actualResult,expectedResult, "They are not equal");

        driver.findElement(By.id("email")).sendKeys("Orientalion87@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("lf;mda'pimbrpeaiojrp");


    }
}
