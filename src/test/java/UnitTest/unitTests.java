package UnitTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.UnitPages.CreateUnitPage;
import Pages.UnitPages.UnitDetailsPage;
import Pages.UnitPages.UnitsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class unitTests extends GlobalSetup {
    UnitsPage unitsPage = new UnitsPage(driver.getWebDriver());
    CreateUnitPage createUnitPage = new CreateUnitPage(driver.getWebDriver());
    UnitDetailsPage unitDetailsPage=new UnitDetailsPage(driver.getWebDriver());
    LoginTests loginTests = new LoginTests();
    String unitName="Test Abdo57";
    @BeforeTest
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        unitsPage.clickOnAddNewUnitBtn();
        createUnitPage.addUnit(unitName, "abdo2", "5421012352", "CODE8595", "This is a test unit", "هذه وحدة تجريبية", "tesAbdo3@example.com", true);
    }
    @Test
    public void addNewUnit() {
        Assert.assertTrue(unitDetailsPage.checkCreatedUnit(unitName),"Unit not created");
    }
}

