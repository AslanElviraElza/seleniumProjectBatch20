package com.project.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BosKasa {
            public static void main(String[] args) throws InterruptedException {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();

                driver.get("http://zero.webappsecurity.com/login.html");
                String expectedInTitle="Zero - Log in";

                String actualTitle=driver.getTitle();
                if(actualTitle.equals(expectedInTitle)){
                    System.out.println("PASSED!!");
                }else{
                    System.out.println("FAILED!!!");
                }
                ////
                driver.get("http://zero.webappsecurity.com/login.html");
                //driver.findElement(By.linkText("Zero Bank")).click();
                String actualResult1 = driver.findElement(By.className("brand")).getText();
                String expectedresult="Zero Bank";
// String actualtitle=driver.getTitle();
                if(actualResult1.equals(expectedresult)){
                    System.out.println("Passed!");
                }else{
                    System.out.println("Failed!!");
                }
                }
            }
