package Pages.WorkflowPages;

import CoreElements.Button;
import CoreElements.Label;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Text;

public class WorkflowsPage {
    private WebDriver driver;

    /*** workflows Page Locators ***/
    public WorkflowsPage(WebDriver driver) {
        this.driver = driver;
    }
    public Button addIcon=new Button(By.className("title-add-icon"));
    public TextBox searchField=new TextBox(By.name("searchString"));
    public Button searchBtn=new Button(By.className("search-btn"));
    public Label searchResult=new Label(By.xpath("//tr/td[1]"));
    public Label invalidSearchResult=new Label(By.className("no-results-title"));
    public Button settingIcon=new Button(By.xpath("//*[@id=\"form-actions-dropdown\"]/span"));
    public Button toggleBtn=new Button(By.className("toggle-activate-workflow"));
    public Button confirmBtn=new Button(By.className("swal2-confirm"));
    public Button editBtn=new Button(By.xpath("//*[@id=\"pagination-table\"]/tbody/tr[1]/td[3]/div/div/div/form/button"));

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

    public boolean checkValidSearchResult(String searchTerm){
        searchField.clearText();
        searchField.typeText(searchTerm);
        searchBtn.click();
        return searchResult.getLabel().equals(searchTerm);
    }
    public boolean checkInvalidSearchResult(String invalidSearchTerm){
        searchField.clearText();
        searchField.typeText(invalidSearchTerm);
        searchBtn.click();
        return invalidSearchResult.getLabel().equals("No Results");
    }
    public void toggleActivation(){
        settingIcon.click();
        toggleBtn.click();
        confirmBtn.click();
    }
    public EditWorkflowPage openEditPage(){
        settingIcon.click();
        editBtn.click();
        return new EditWorkflowPage(driver);
    }
}
