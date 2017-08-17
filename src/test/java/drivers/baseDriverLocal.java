package drivers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class baseDriverLocal {

    public WebDriver driver =null;

    @BeforeClass
    public void setUp(){
        driver=new FirefoxDriver();
        driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown(){
        driver.close();
        driver.quit();

    }
}
