package UnitTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.CreateUnitPage;
import Pages.EditUnitPage;
import Pages.UnitDetailsPage;
import Pages.UnitsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditUnitTests extends GlobalSetup {
    UnitsPage unitsPage = new UnitsPage(driver.getWebDriver());
    EditUnitPage editUnitPage = new EditUnitPage(driver.getWebDriver());
    UnitDetailsPage unitDetailsPage = new UnitDetailsPage(driver.getWebDriver());
    LoginTests loginTests = new LoginTests();
    String unitName = "Test Abdo527";

    @BeforeTest
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        unitsPage.openEditPage();
        editUnitPage.editUnit(unitName,"secondary name1");
    }

    @Test
    public void addNewUnit() {
        Assert.assertTrue(unitDetailsPage.checkCreatedUnit(unitName), "Unit not Updated");
    }
}
