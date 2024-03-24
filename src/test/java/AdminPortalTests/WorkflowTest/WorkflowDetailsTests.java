package AdminPortalTests.WorkflowTest;

import GlobalSetup.GlobalSetup;
import Pages.AdminPortal.WorkflowPages.WorkflowDetails;
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