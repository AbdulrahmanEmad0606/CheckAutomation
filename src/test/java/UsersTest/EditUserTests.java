package UsersTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.SideMenu;
import Pages.UserPages.CreateUserPage;
import Pages.UserPages.EditUserPage;
import Pages.UserPages.UserDetailsPage;
import Pages.UserPages.UsersPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditUserTests extends GlobalSetup {
    LoginTests loginTests = new LoginTests();
    SideMenu sideMenu = new SideMenu(driver.getWebDriver());
    UsersPage usersPage = new UsersPage(driver.getWebDriver());
    EditUserPage editUserPage=new EditUserPage(driver.getWebDriver());
    UserDetailsPage userDetailsPage = new UserDetailsPage(driver.getWebDriver());
    @BeforeTest
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        sideMenu.openUsersPage().openEditPage().fillOutForm("Abdo");
    }
    @Test
    public void checkEdit(){
        Assert.assertTrue(userDetailsPage.checkPageTitle(),"invalid");
    }
}
