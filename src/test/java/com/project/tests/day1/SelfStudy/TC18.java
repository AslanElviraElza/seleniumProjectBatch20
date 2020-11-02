package com.project.tests.day1.SelfStudy;

import com.project.utilities.BrowserUtils;
import com.project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TC18 {
    /*
TC #18:   Hover  Test
1.Go   to https://demos.telerik.com/kendo-ui/dragdrop/index
2.Drag and    drop   the    small  circle to bigger circle.
3.Assert:  -Text  in big    circle changed to:    "You did   great"
 */

    @Test
    public void hoverTest(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement iframe = Driver.getDriver().findElement(By.xpath("//div[@id='example']"));

        WebElement biggerCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        WebElement smallerCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(smallerCircle, biggerCircle).perform();

        WebElement youDidGrerat = Driver.getDriver().findElement(By.xpath("//div[.='You did great!']"));

        Assert.assertTrue(youDidGrerat.isDisplayed(), "You did great is not desplayed!!!");

        BrowserUtils.wait(2);
        Driver.closeDriver();
    }


}
