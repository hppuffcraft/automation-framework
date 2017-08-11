package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class fblogout extends drivers.driver {

    @Test
    public void fbLogOut() throws IOException {

        //Open navigation drop down menu
        WebElement lstitem = driver.findElement(By.id("userNavigationLabel"));
        lstitem.click();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Select log out option
        driver.findElement(By.partialLinkText("Log Out")).click();
        System.out.println("Logged out");

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Screenshot
        File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile5, new File("/Users/erica.hagle/AutomationFramework/screenshots/facebook_logout.png"));

    }

}
