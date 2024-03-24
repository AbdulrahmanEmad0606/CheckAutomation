package AdminPortalTests.UsersTest;

import GlobalSetup.GlobalSetup;
import AdminPortalTests.LoginTest.LoginTests;
import Pages.AdminPortal.SideMenu;
import Pages.AdminPortal.UserPages.CreateUserPage;
import Pages.AdminPortal.UserPages.UserDetailsPage;
import Pages.AdminPortal.UserPages.UsersPage;
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
        sideMenu.openUsersPage().openUserForm().fillOutForm("Test User", "testuser5", "12345233886", "test136@example.com", "+1234567890", "Inspector", "Unit 2");
    }

    @Test
    public void testAddNewUser() {
        Assert.assertTrue(userDetailsPage.checkPageTitle(), "Invalid page title");
    }
}
