package AdminPortalTests.UnitTest;

import GlobalSetup.GlobalSetup;
import AdminPortalTests.LoginTest.LoginTests;
import Pages.AdminPortal.UnitPages.UnitsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchTests extends GlobalSetup {
    UnitsPage unitsPage=new UnitsPage(driver.getWebDriver());
    LoginTests loginTests=new LoginTests();
    @BeforeTest
    public void checkLogin(){
        loginTests.testSuccessfulLogin();
        unitsPage.setValidSearchTerm("Unitx5");
        unitsPage.clickSearch();
    }
    @Test
    public void testValidSearchUnits() {
        Assert.assertTrue(unitsPage.checkSearchResult(),"In valid search result");
    }

}
