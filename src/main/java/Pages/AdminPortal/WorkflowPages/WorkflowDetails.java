package Pages.AdminPortal.WorkflowPages;

import org.openqa.selenium.WebDriver;

public class WorkflowDetails {
    private WebDriver driver;

    /*** AddWorkflow Page Locators ***/
    public WorkflowDetails(WebDriver driver) {
        this.driver = driver;
    }
    /**check page title**/
    public boolean checkPageTitle(){
        return driver.getTitle().equals("Check Plus - Details");
    }
}
