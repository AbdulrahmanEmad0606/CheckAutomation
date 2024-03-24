package Pages.AdminPortal.WorkflowPages;

import CoreElements.Button;
import CoreElements.CheckBox;
import CoreElements.Label;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EditWorkflowPage {
    private WebDriver driver;

    /*** EditWorkflowPage Page Locators ***/
    public EditWorkflowPage(WebDriver driver) {
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
        return driver.getTitle().equals("Check Plus - Edit Workflow");
    }

    public WorkflowDetails FillWorkflowPrimaryData(String roleId) {
        new Select(driver.findElement(roleDropdown)).selectByVisibleText(roleId);
        saveButton.click();
        return new WorkflowDetails(driver);
    }

}
