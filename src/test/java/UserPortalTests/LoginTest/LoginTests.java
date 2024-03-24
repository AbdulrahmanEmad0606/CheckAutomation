package UserPortalTests.LoginTest;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends GlobalSetup {
    String successMail = "auto_user";
    String successPassword = "123456";
    LoginPage loginPage=new LoginPage(driver.getWebDriver());
    @Test(priority = 1)
    public void testValidLogin(){
        Assert.assertTrue(loginPage.fillLoginForm(successMail,successPassword).getGreetingLabel(),"Login Failed");
        System.out.println("Hello");
    }
    @Test(priority = 2)
    public void testInValidLogin(){
        loginPage.fillDataForInvalidLogin();
        Assert.assertTrue((loginPage.checkInvalidMSG()),"Login Success");
    }
}
