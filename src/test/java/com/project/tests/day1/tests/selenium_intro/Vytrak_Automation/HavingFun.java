package com.project.tests.day1.tests.selenium_intro.Vytrak_Automation;

import com.project.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HavingFun {
    //Open this link - https://www.techlistic.com/p/selenium-practice-form.html
    //Enter first and last name (textbox).
    //Select gender (radio button).
    //Select years of experience (radio button).
    //Enter date.
    //Select Profession (Checkbox).
    //Select Automation tools you are familiar with (multiple checkboxes).
    //Select Continent (Select box).
    //Select multiple commands from a multi select box.
    //If you can handle Upload image then try it or leave this step.
    //Click on Download file link and handle the download file pop-up (leave it if you are beginner).
    //Click on Submit button.
    //Try your own logic and automate it without any help. If you still find it difficult to automate then follow reference links.

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void Fun() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Faker faker = new Faker();
       WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
       firstName.sendKeys(faker.name().firstName());

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        WebElement gender = driver.findElement(By.xpath("//input[@id='sex-0']"));
        gender.click();

        Thread.sleep(3000);
        WebElement yearsOfExperience = driver.findElement(By.xpath("//input[@id='exp-2']"));
        yearsOfExperience.click();

        WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("01/01/2020");

        WebElement profession = driver.findElement(By.xpath("//label[@class='checkbox']"));
        profession.click();

        Thread.sleep(3000);
        WebElement automationTool = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
        automationTool.click();

        WebElement Continents = driver.findElement(By.id("continents"));
        Continents.click();

        Select continent =new Select(driver.findElement(By.xpath("//option[.='North America']")));
        continent.selectByVisibleText("North America");

       // WebElement seleniumCommands =
    }

}
