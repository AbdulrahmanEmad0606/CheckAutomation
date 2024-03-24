package AdminPortalTests.UsersTest;

import AdminPortalTests.LoginTest.LoginTests;
import GlobalSetup.GlobalSetup;
import Pages.AdminPortal.SideMenu;
import Pages.AdminPortal.UserPages.ChangePasswordPage;
import Pages.AdminPortal.UserPages.UsersPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChangePasswordTests extends GlobalSetup {
    LoginTests loginTests = new LoginTests();
    SideMenu sideMenu = new SideMenu(driver.getWebDriver());
    UsersPage usersPage = new UsersPage(driver.getWebDriver());
    ChangePasswordPage changePasswordPage=new ChangePasswordPage(driver.getWebDriver());
    @BeforeTest
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        sideMenu.openUsersPage().openChangePasswordPage().changePass("123456","123456");
        usersPage.openChangePasswordPage();
    }

    @Test
    public void testAddNewUser() {
        Assert.assertTrue(usersPage.checkPageTitle(), "Invalid page title");
    }
}
