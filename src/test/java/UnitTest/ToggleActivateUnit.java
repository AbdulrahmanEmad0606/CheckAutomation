package UnitTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.UnitsPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToggleActivateUnit extends GlobalSetup {
    UnitsPage unitsPage = new UnitsPage(driver.getWebDriver());
    LoginTests loginTests = new LoginTests();

    @BeforeTest
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
    }

    @Test
    public void addNewUnit() {
        unitsPage.toggleActivateUnit();
    }
}
