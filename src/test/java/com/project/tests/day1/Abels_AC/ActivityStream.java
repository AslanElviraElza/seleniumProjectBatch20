package com.project.tests.day1.Abels_AC;

import com.project.tests.day8_alerts_Iframes_windows.BrowserUtils;
import com.project.utilities.BitrixReader;
import com.project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivityStream {
    @Test
    public void ac4() {
        //get the necessary data such as url, credentials...
        String url = BitrixReader.getProperty("url");
        String login = BitrixReader.getProperty("login");
        String password = BitrixReader.getProperty("password");
        String taskName1 = BitrixReader.getProperty("taskName1");
        String sampleQuote = BitrixReader.getProperty("quote");
        //Get to bitrix webpage

        Driver.getDriver();
        //enter login credential
        Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(login);
        //enter password credentials
        Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(password);
        //press the login button
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
        //press the task tab
        WebElement taskTab = Driver.getDriver().findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTab.click();
        //insert task name
        BrowserUtils.wait(6);
        WebElement taskNameField = Driver.getDriver().findElement(By.xpath("//div[@class='task-info-panel-title']//input"));
        taskNameField.sendKeys(taskName1);
        //click the quote link
        WebElement quoteLink = Driver.getDriver().findElement(By.xpath("//span[@id='bx-b-quote-task-form-lifefeed_task_form']//span//i"));
        quoteLink.click();
        //change frame to the frame where the quote field is
        BrowserUtils.wait(6);
        Driver.getDriver().switchTo().frame(1);
        //focus on the quote link
        WebElement blockQuote = Driver.getDriver().findElement(By.xpath("//blockquote[@class='bxhtmled-quote']"));
        blockQuote.sendKeys(sampleQuote);
        //change frame to the default
        Driver.getDriver().switchTo().defaultContent();
        //press the send button to submit the sample quote
        WebElement sendButton = Driver.getDriver().findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();
        //verify success message
        BrowserUtils.wait(6);
        String expectedMessage = "Task has been created";
        String actualMessage = Driver.getDriver().findElement(By.xpath("//div[@class='feed-create-task-popup-title']")).getText();
        Assert.assertTrue(actualMessage.equals(expectedMessage));
    }
    @Test
    public void ac8() {
        //get the necessary data such us url, credentials...
        String url = BitrixReader.getProperty("url");
        String login = BitrixReader.getProperty("login");
        String password = BitrixReader.getProperty("password");
        String taskName2 = BitrixReader.getProperty("taskName2");
        String taskDetail2 = BitrixReader.getProperty("taskDetail2");
        //Get to bitrix webpage
        Driver.getDriver().get(url);
        //enter login credential
        Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(login);
        //enter password credentials
        Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(password);
        //press the login button
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();
        //press the task tab
        WebElement taskTab = Driver.getDriver().findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskTab.click();
        //insert task name
        BrowserUtils.wait(6);
        WebElement taskNameField = Driver.getDriver().findElement(By.xpath("//div[@class='task-info-panel-title']//input"));
        taskNameField.sendKeys(taskName2);
        //change frame to the frame where the quote field is
        BrowserUtils.wait(6);
        Driver.getDriver().switchTo().frame(1);
        //focus on the task detail field
        WebElement taskDetailField = Driver.getDriver().findElement(By.xpath("//body"));
        taskDetailField.sendKeys(taskDetail2);
        //change frame to the default
        Driver.getDriver().switchTo().defaultContent();
        //click on add more link
        WebElement addMoreLink = Driver.getDriver().findElement(By.xpath("//div[@id='bx-component-scope-lifefeed_task_form-responsible']//a[@class='js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add']"));
        addMoreLink.click();
        //click on recent option
        BrowserUtils.wait(6);
        WebElement recentOption = Driver.getDriver().findElement(By.xpath("//div[@class='bx-finder-box-tabs']//a[1]"));
        recentOption.click();
        //select email from the recent list
        WebElement recentEmailList = Driver.getDriver().findElement(By.xpath("//div[.='helpdesk25@cybertekschool.com']//div"));
        recentEmailList.click();
        //click on employees and department option
        WebElement employeesDepartmentOption = Driver.getDriver().findElement(By.xpath("//div[@class='bx-finder-box-tabs']//a[2]"));
        employeesDepartmentOption.click();
        //select email from the employees and department list
        BrowserUtils.wait(6);
        WebElement empDepList = Driver.getDriver().findElement(By.xpath("//div[@id='bx-lm-category-relation-129']//div[.='helpdesk23@cybertekschool.com']"));
        empDepList.click();
        //click on employees and department option
        WebElement emailUsersOption = Driver.getDriver().findElement(By.xpath("//div[@class='bx-finder-box-tabs']//a[3]"));
        emailUsersOption.click();
        ////div[@id='bx-component-scope-lifefeed_task_form-responsible']//input[@class='js-id-tdp-mem-sel-is-search js-id-network-selector-search task-form-field-search task-form-field-input']
        //press the send button to submit the sample quote
        WebElement sendButton = Driver.getDriver().findElement(By.xpath("//button[@id='blog-submit-button-save']"));
        sendButton.click();
        //verify success message
        BrowserUtils.wait(1);
        String expectedMessage = "Task has been created";
        String actualMessage = Driver.getDriver().findElement(By.xpath("//div[@class='feed-create-task-popup-title']")).getText();
        Assert.assertTrue(actualMessage.equals(expectedMessage));
    }
}
