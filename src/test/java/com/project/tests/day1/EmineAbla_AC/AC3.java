package com.project.tests.day1.EmineAbla_AC;

import com.project.utilities.BrowserUtils;
import com.project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class AC3 {
    public void login(){
        Driver.getDriver().get("http://login2.nextbasecrm.com/stream/");
        BitrixLogIn.loginToBitrix(Driver.getDriver());

        WebElement message = Driver.getDriver().findElement(By.xpath("(//span[.='Message'])[1]"));
        message.click();

        BrowserUtils.wait(2);
        WebElement uploadFiles= Driver.getDriver().findElement(By.xpath("//span[@id='bx-b-uploadfile-blogPostForm']"));
        uploadFiles.click();

        WebElement uploadImg= Driver.getDriver().findElement(By.xpath("(//div[@class='diskuf-uploader'])[1]"));
        uploadImg.click();

        WebElement downloadFromExternal= Driver.getDriver().findElement(By.xpath("(//span[@class='wd-fa-add-file-light-title-text'])[2]"));
        downloadFromExternal.click();
    }
                  //////sout
}
 