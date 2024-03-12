package WorkflowTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.SideMenu;
import Pages.WorkflowPages.WorkflowsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkflowTests extends GlobalSetup {
    LoginTests loginTests = new LoginTests();
    SideMenu sideMenu = new SideMenu(driver.getWebDriver());
    WorkflowsPage workflowsPage=new WorkflowsPage(driver.getWebDriver());
    @BeforeClass
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        sideMenu.openWorkflowsPage();
    }
    @Test
    public void checkWorkflowPageOpenedSuccessfully(){
      Assert.assertTrue(workflowsPage.checkPageTitle(),"In-valid title");
    }
    @Test
    public void checkValidSearch(){
        Assert.assertTrue(workflowsPage.checkValidSearchResult("test flow1"),"In-valid Workflow name");
    }
    @Test
    public void checkInvalidSearch(){
        Assert.assertTrue(workflowsPage.checkInvalidSearchResult("test 6879897"),"In-valid Workflow name");
    }
    @Test
    public void checkToggleActivation(){
        workflowsPage.checkValidSearchResult("test flow1");
        workflowsPage.toggleActivation();
    }
}
