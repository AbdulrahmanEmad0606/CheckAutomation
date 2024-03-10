package UnitTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.UnitPages.UnitsPage;
import org.testng.annotations.Test;

public class ToggleActivateUnit extends GlobalSetup {
    UnitsPage unitsPage = new UnitsPage(driver.getWebDriver());
    LoginTests loginTests = new LoginTests();

    @Test
    public void addNewUnit() throws InterruptedException {
        loginTests.testSuccessfulLogin();
        unitsPage.toggleActivateUnit();
    }
}
