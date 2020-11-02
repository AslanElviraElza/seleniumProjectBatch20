package com.project.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BitrixLogIn {
    public static void loginToBitrix(WebDriver driver){
        //3. Enter username:
        WebElement usernameInput = driver.findElement(By.xpath("//input[@class='login-inp']"));
        usernameInput.sendKeys("hr7@cybertekschool.com");
        //4. Enter password:
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("UserUser");
        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();
    }
}
