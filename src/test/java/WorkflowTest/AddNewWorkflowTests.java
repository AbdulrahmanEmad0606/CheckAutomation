package WorkflowTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.SideMenu;
import Pages.WorkflowPages.AddWorkflowPage;
import Pages.WorkflowPages.WorkflowDetails;
import Pages.WorkflowPages.WorkflowsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddNewWorkflowTests  extends GlobalSetup {
    LoginTests loginTests = new LoginTests();
    SideMenu sideMenu = new SideMenu(driver.getWebDriver());
    WorkflowsPage workflowsPage=new WorkflowsPage(driver.getWebDriver());
    AddWorkflowPage addWorkflowPage=new AddWorkflowPage(driver.getWebDriver());
    WorkflowDetails workflowDetails=new WorkflowDetails(driver.getWebDriver());

    @BeforeTest
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        sideMenu.openWorkflowsPage().openWorkflowCreationPage().FillWorkflowPrimaryData("test flow1","test flow1","Supervisor");
    }
    @Test
    public void checkCreationWorkflowPageOpenedSuccessfully(){
        Assert.assertTrue(workflowDetails.checkPageTitle(),"In-valid title");
    }
}
