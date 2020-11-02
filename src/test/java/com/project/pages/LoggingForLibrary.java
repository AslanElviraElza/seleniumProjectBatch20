package com.project.pages;

import com.project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggingForLibrary {
        public LoggingForLibrary(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//input[@type='email']")
        public WebElement libraryUserName;

        @FindBy(xpath = "//input[@type='password']")
        public  WebElement libraryPassword;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement librarySubmitButton;

        @FindBy(xpath = "(//span[@class='title'])[3]")
        public WebElement libraryBookButton;

        @FindBy(xpath = "//table[@id='tbl_books']//tr[2]/td[1]")
        public WebElement edit;

        @FindBy(xpath = "//button[.='Save changes']")
        public WebElement saveChanges;
}
