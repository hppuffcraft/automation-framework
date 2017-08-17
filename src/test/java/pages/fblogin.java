package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class fblogin {

    public WebDriver driver = null;

    //Locators
    By email = By.xpath("//INPUT[@id='email']");
    By password = By.xpath("//INPUT[@id='pass']");
    By loginButton = By.id("loginbutton");

    //Constructor
    public fblogin(WebDriver driver) {
        this.driver = driver;
    }

    //Method?
    public void loginToFB(String uname, String pwd) throws Exception {

        //Navigate to URL
        driver.navigate().to("https://www.facebook.com");
        System.out.println("Navigated to Facebook page");

        //Enter email address
        driver.findElement(email).sendKeys(uname);
        System.out.println("Email entered");

        //Enter password
        driver.findElement(password).sendKeys(pwd);
        System.out.println("Password entered");

        //Click login button
        driver.findElement(loginButton).click();
        System.out.println("Login button clicked");

        //Wait (Implicit) for page to load after logging in
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Logged into Facebook successfully");

    }

}
