package LoginTest;

import GlobalSetup.GlobalSetup;
import Pages.LoginPage;
import Pages.UnitsPage;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class LoginTests extends GlobalSetup {
    SoftAssert softAssert = new SoftAssert();
    LoginPage loginPage = new LoginPage(driver.getWebDriver());
    UnitsPage unitsPage=new UnitsPage(driver.getWebDriver());
    String successMail = "check7";
    String successPassword = "P@ssw0rd";

    @Test(priority = 1)
    public void tesLoginWithInvalidData() {
        loginPage.fillDataForInvalidLogin();
        softAssert.assertTrue(loginPage.checkErrorMessage(), "Invalid error message");
    }

    @Test(priority = 2)
    public void testSuccessfulLogin() {
        loginPage.fillDataForValidLogin(successMail, successPassword);
        softAssert.assertEquals(unitsPage.checkLogoAvailability(),true, "Login Failed");
    }
    @Test(priority = 3)
    public void testEmptyCredentialsLogin() {
        loginPage.fillDataForValidLogin("", "");
        softAssert.assertTrue(loginPage.checkErrorMessage(), "Invalid error message");
    }

}