package Pages.WorkflowPages;

import CoreElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkflowsPage {
    private WebDriver driver;

    /*** workflows Page Locators ***/
    public WorkflowsPage(WebDriver driver) {
        this.driver = driver;
    }
    public Button addIcon=new Button(By.className("title-add-icon"));
    /*** workflows Page Actions ***/
    /**check page title**/
    public boolean checkPageTitle(){
        return driver.getTitle().equals("Check Plus - Workflow");
    }
    /**click on add button**/
    public AddWorkflowPage openWorkflowCreationPage(){
        addIcon.click();
        return new AddWorkflowPage(driver);
    }
}
