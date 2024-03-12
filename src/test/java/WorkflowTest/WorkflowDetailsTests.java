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

public class WorkflowDetailsTests extends GlobalSetup {
    AddNewWorkflowTests addNewWorkflowTests;
    WorkflowDetails workflowDetails=new WorkflowDetails(driver.getWebDriver());
    @BeforeTest
    public void checkLogin() {
        addNewWorkflowTests.checkCreationWorkflowPageOpenedSuccessfully();
    }
    @Test
    public void checkWorkflowPageOpenedSuccessfully(){
        Assert.assertTrue(workflowDetails.checkPageTitle(),"In-valid title");
    }
}