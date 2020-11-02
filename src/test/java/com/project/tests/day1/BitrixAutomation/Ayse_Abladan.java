package com.project.tests.day1.BitrixAutomation;

import com.project.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ayse_Abladan {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/stream/");
    }
    @Test
    public void AC2() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//input[@name= 'USER_LOGIN']"));
        element.sendKeys("hr7@cybertekschool.com");
        element.click();

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");
        password.click();

        WebElement logIn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        logIn.click();

        WebElement message = driver.findElement(By.xpath("//span[@class='feed-add-post-form-link feed-add-post-form-link-active']"));
        message.click();

        //iframe[@class='bx-editor-iframe']
        WebElement writeMessageClick = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td/div/div[2]/div/div[1]/div/div/div[3]/div/div/form/div[1]/div/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/iframe"));

        driver.switchTo().frame(1);
        // writeMessageClick.click();
        // Thread.sleep(2000);
        WebElement writeMessage = driver.findElement(By.xpath("/html/body"));
        writeMessage.sendKeys("Hello Batch20  ");
        writeMessage.sendKeys("yay ");
       /*
        driver.switchTo().parentFrame();
        WebElement addMore = driver.findElement(By.xpath("//a[.='Add more']"));
        addMore.click();

        WebElement EmployeesAndDepartment = driver.findElement(By.xpath("//a[.='Employees and departments']"));
        EmployeesAndDepartment.click();

        WebElement email = driver.findElement(By.xpath("//span[@class='feed-add-post-destination-text']"));
        email.click();

        WebElement send = driver.findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        send.click();

        //driver.navigate().to("Active Stream");
        // WebElement displayedMail= driver.findElement(By.xpath("//div[@class='feed-post-cont-wrap sonet-log-item-createdby-699 sonet-log-item-where-U-699-all sonet-log-item-where-U-699-blog-post sonet-log-item-where-U-699-blog'][1]"));
        // displayedMail.click();
        // Assert.assertTrue(displayedMail.isDisplayed(),"Not Displayed. Verification Failed!");
        // WebElement allEmployees = driver.findElement(By.xpath("//a[.='All employees']"));
        // allEmployees.click();
        // WebElement clickEmail = driver.findElement(By.xpath("//div[.='helpdesk25@cybertekschool.com']/div"));
        // clickEmail.click();

        */
    }
}
