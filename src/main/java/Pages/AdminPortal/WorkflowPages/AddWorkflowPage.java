package Pages.AdminPortal.WorkflowPages;

import CoreElements.Button;
import CoreElements.CheckBox;
import CoreElements.Label;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddWorkflowPage {
    private WebDriver driver;

    /*** AddWorkflow Page Locators ***/
    public AddWorkflowPage(WebDriver driver) {
        this.driver = driver;
    }

    private TextBox primaryNameInput = new TextBox(By.id("NameEn"));
    private TextBox secondaryNameInput = new TextBox(By.id("NameAr"));
    private Button unitDropdown = new Button(By.className("multiselect"));
    private CheckBox unitName= new CheckBox(By.xpath("//ul/li[1]/a/label/input"));
    private Label sectionHeading=new Label(By.className("section-heading"));
    private By roleDropdown = By.id("AssignedRoleId");
    private Button saveButton = new Button(By.xpath(("//label[@type='submit']")));

    /**
     * check page title
     **/
    public boolean checkPageTitle() {
        return driver.getTitle().equals("Check Plus - Add Workflow");
    }

    public WorkflowDetails FillWorkflowPrimaryData(String primaryName,String secondaryName,String roleId) {
        primaryNameInput.typeText(primaryName);
        secondaryNameInput.typeText(secondaryName);
        unitDropdown.click();
        unitName.click();
        sectionHeading.click();
        new Select(driver.findElement(roleDropdown)).selectByVisibleText(roleId);
        saveButton.click();
        return new WorkflowDetails(driver);
    }

}
