package AdminPortalTests.WorkflowTest;

import AdminPortalTests.LoginTest.LoginTests;
import GlobalSetup.GlobalSetup;
import Pages.AdminPortal.SideMenu;
import Pages.AdminPortal.WorkflowPages.WorkflowDetails;
import Pages.AdminPortal.WorkflowPages.WorkflowsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkflowEditTests extends GlobalSetup {
    LoginTests loginTests = new LoginTests();
    SideMenu sideMenu = new SideMenu(driver.getWebDriver());
    WorkflowsPage workflowsPage = new WorkflowsPage(driver.getWebDriver());
    WorkflowDetails workflowDetails = new WorkflowDetails(driver.getWebDriver());
    @BeforeClass
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        sideMenu.openWorkflowsPage().checkValidSearchResult("test flow1");
        workflowsPage.openEditPage().FillWorkflowPrimaryData("Supervisor");
    }
    @Test
    public void checkCreationWorkflowPageOpenedSuccessfully() {
        Assert.assertTrue(workflowDetails.checkPageTitle(), "In-valid title");
    }
}
