package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class fblogout {

    public WebDriver driver = null;

    //Locators for Logout
    By usrNav = By.id("userNavigationLabel");
    By logout = By.partialLinkText("Log out");

    //Constructor
    public fblogout(WebDriver driver) {
        this.driver = driver;

    }

    public void logoutOfFB() throws Exception {

        //Open dropdown nav menu
        driver.findElement(usrNav).click();
        System.out.println("Clicked to open dropdown nav menu");

        //Wait (Implicit) for dropdown menu to load
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Dropdown nav menu is open");

        //Click on logout option
        driver.findElement(logout).click();
        System.out.println("Clicked logout");

        //Wait for page to log out
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Logged out of Facebook");


    }

}
