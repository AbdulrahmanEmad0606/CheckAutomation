package UnitTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.CreateUnitPage;
import Pages.UnitsPage;
import Pages.Utilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class unitTests extends GlobalSetup {
    UnitsPage unitsPage=new UnitsPage(driver.getWebDriver());
    CreateUnitPage createUnitPage=new CreateUnitPage(driver.getWebDriver());
    LoginTests loginTests=new LoginTests();
    @Test
    public void testSearchUnits() {
        // Assume the user is already logged in and on the Units page

        loginTests.testSuccessfulLogin();
        unitsPage.setSearchTerm("Unitx5");
        unitsPage.clickSearch();
        // Verify that search results are displayed correctly
        // This verification depends on the page structure and might involve checking the presence of certain elements
    }
    @Test
    public void addNewUnit(){
        loginTests.testSuccessfulLogin();
        unitsPage.clickOnAddNewUnitBtn();
        createUnitPage.addUnit("Test Unitx5", "وحدة تجريبية", "Nam24", "CODE123456", "This is a test unit", "هذه وحدة تجريبية", "test55@example.com", true);
            // Here, you should add assertions to verify the success of the unit creation.
        }
    }

