package UsersTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.SideMenu;
import Pages.UserPages.CreateUserPage;
import Pages.UserPages.UserDetailsPage;
import Pages.UserPages.UsersPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddUsersTests extends GlobalSetup {
    LoginTests loginTests = new LoginTests();
    SideMenu sideMenu = new SideMenu(driver.getWebDriver());
    UsersPage usersPage = new UsersPage(driver.getWebDriver());
    CreateUserPage createUserPage = new CreateUserPage(driver.getWebDriver());
    UserDetailsPage userDetailsPage = new UserDetailsPage(driver.getWebDriver());

    @BeforeTest
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        sideMenu.openUsersPage().openUserForm().fillOutForm("Test User", "testuser2", "123452336", "test13@example.com", "+1234567890", "Inspector", "Unit 2");
    }

    @Test
    public void testAddNewUser() {
        Assert.assertTrue(userDetailsPage.checkPageTitle(), "Invalid page title");
    }
}
