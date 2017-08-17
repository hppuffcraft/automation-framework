package testcases;

import org.testng.annotations.Test;
import pages.fblogin;
import pages.fblogout;

public class verifyFbTCs extends drivers.baseDriverLocal {

    @Test
    public void verifyTCLogin() throws Exception {

        fblogin login = new fblogin(driver);
        login.loginToFB("akqaerica@gmail.com", "ISSDW$Xnh9xg");

    }

    @Test (dependsOnMethods = "verifyTCLogin")
    public void verifyTCLogout() throws Exception {

        fblogout logout = new fblogout(driver);
        logout.logoutOfFB();

    }

}
