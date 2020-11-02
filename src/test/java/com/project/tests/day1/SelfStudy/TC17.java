package com.project.tests.day1.SelfStudy;

import com.project.utilities.BrowserUtils;
import com.project.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC17 {
    /*
   TC #17:   Context    Click  –HOMEWORK
   1.Go   to https://the-internet.herokuapp.com/context_menu
   2.Right    click  to the    box.
   3.Alert    will   open.
   4.Accept   alertNo    assertion  needed for    this   practice.
 */

    @Test
    public void  ContextClick(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        WebElement clickTheBox = Driver.getDriver().findElement(By.xpath("//div[@id='hot-spot']"));

        Actions action = new Actions(Driver.getDriver());
        action.contextClick(clickTheBox).perform();

        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

        BrowserUtils.wait(2);
        Driver.closeDriver();

    }
}
