package com.project.tests.day1.SelfStudy;

import com.project.utilities.BrowserUtils;
import com.project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC16 {
    /*
TC  #16:   Double ClickTest
1.Go   to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
2.Switch   to iframe.
3.Double   click  on the    text   "Double-click  me to change my text   color.
"4.Assert:Text's   "style"    attribute  value  contains "red"
 */
    @Test
    public void Hover_Test(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@name='iframeResult']"));
        Driver.getDriver().switchTo().frame(iframe);

        WebElement doubleClick = Driver.getDriver().findElement(By.xpath("//p[@id='demo']"));

        Actions action = new Actions(Driver.getDriver());
        action.doubleClick(doubleClick).perform();

        String actualResult= doubleClick.getAttribute("style");

        Assert.assertTrue(actualResult.contains("red"), "Attribute style does not contain red. Thus test FAILD!!!");

        BrowserUtils.wait(2);
        Driver.closeDriver();

    }
}
