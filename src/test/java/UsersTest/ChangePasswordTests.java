package UsersTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.SideMenu;
import Pages.UserPages.ChangePasswordPage;
import Pages.UserPages.UsersPage;
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
        sideMenu.openUsersPage();
        usersPage.openChangePasswordPage();
        changePasswordPage.changePass("123456","123456");
    }

    @Test
    public void testAddNewUser() {
        Assert.assertTrue(usersPage.checkPageTitle(), "Invalid page title");
    }
}
