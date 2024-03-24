package AdminPortalTests.UnitTest;

import GlobalSetup.GlobalSetup;
import AdminPortalTests.LoginTest.LoginTests;
import Pages.AdminPortal.UnitPages.UnitDetailsPage;
import Pages.AdminPortal.UnitPages.UnitsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditUnitTests extends GlobalSetup {
    UnitsPage unitsPage = new UnitsPage(driver.getWebDriver());
    UnitDetailsPage unitDetailsPage = new UnitDetailsPage(driver.getWebDriver());
    LoginTests loginTests = new LoginTests();
    String unitName = "Test Abdo527";

    @BeforeTest
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        unitsPage.openEditPage().editUnit(unitName,"secondary name1");
    }

    @Test
    public void addNewUnit() {
        Assert.assertTrue(unitDetailsPage.checkCreatedUnit(unitName), "Unit not Updated");
    }
}
