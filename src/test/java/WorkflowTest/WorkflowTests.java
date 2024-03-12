package WorkflowTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.SideMenu;
import Pages.WorkflowPages.WorkflowsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkflowTests extends GlobalSetup {
    LoginTests loginTests = new LoginTests();
    SideMenu sideMenu = new SideMenu(driver.getWebDriver());
    WorkflowsPage workflowsPage=new WorkflowsPage(driver.getWebDriver());
    @BeforeTest
    public void checkLogin() {
        loginTests.testSuccessfulLogin();
        sideMenu.openWorkflowsPage();
    }
    @Test
    public void checkWorkflowPageOpenedSuccessfully(){
      Assert.assertTrue(workflowsPage.checkPageTitle(),"In-valid title");
    }
}
