package com.project.tests.day1.LibraryApp;

import com.project.pages.LoggingForLibrary;
import com.project.utilities.BrowserUtils;
import com.project.utilities.ConfigurationReader;
import com.project.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryAC4 {
//AC4: Verify that the user can edit a book after it was created

    LoggingForLibrary logInToLibrary;

    @Test
    public  void libraryLogin(){

        logInToLibrary = new LoggingForLibrary();

        Driver.getDriver().get(ConfigurationReader.getProperty("libraryUrl"));

        logInToLibrary.libraryUserName.sendKeys(ConfigurationReader.getProperty("libraryUsername"));

        logInToLibrary.libraryPassword.sendKeys(ConfigurationReader.getProperty("libraryPassword"));

        logInToLibrary.librarySubmitButton.click();

        BrowserUtils.wait(2);
        logInToLibrary.libraryBookButton.click();

        logInToLibrary.edit.click();

        BrowserUtils.wait(2);
        logInToLibrary.saveChanges.click();

        Assert.assertTrue(logInToLibrary.edit.isDisplayed(), "Verification FAILED!!!");

    }
}
