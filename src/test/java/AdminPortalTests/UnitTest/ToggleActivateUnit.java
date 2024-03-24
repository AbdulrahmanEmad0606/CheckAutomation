package AdminPortalTests.UnitTest;

import GlobalSetup.GlobalSetup;
import AdminPortalTests.LoginTest.LoginTests;
import Pages.AdminPortal.UnitPages.UnitsPage;
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
