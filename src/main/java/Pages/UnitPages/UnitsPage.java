package Pages.UnitPages;

import CoreElements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnitsPage {
    private WebDriver driver;

    /*** Unit Page Locators ***/
    public UnitsPage(WebDriver driver) {
        this.driver = driver;
    }

    Image logo = new Image(By.className("logo-container"));
    Link addNewUnitButton=new Link(By.cssSelector(".icon.icon-add"));
    TextBox searchInput =new TextBox(By.id("filter"));
    Button searchButton = new Button(By.className("search-btn"));
    Link unitName=new Link(By.cssSelector(".name .trigger-spinner"));
    Button settingIcon=new Button(By.xpath("//tr[1]/td[5]"));
    Button editButton=new Button(By.xpath("//tr[1]/td[5]/div/div/form/button"));
    Button toggleButton=new Button(By.xpath("//*[@id=\"pagination-table\"]/tbody/tr[1]/td[5]/div/div/button[1]"));
    Button approveMsg=new Button(By.className("swal2-confirm"));
    /*** Unit page actions***/
    /*** Get logo ***/
    public boolean checkLogoAvailability() {
        logo.getPath();
        return logo.isDisplayed(By.className("logo-container"));
    }

    /***Click on addNewUnitButton ***/
    public CreateUnitPage clickOnAddNewUnitBtn(){
        addNewUnitButton.click();
        return new CreateUnitPage(driver);
    }

    /*************************************************************************/
    /***Search Feature***/
    public void setValidSearchTerm(String searchTerm) {
        searchInput.typeText(searchTerm);
    }
    public void clickSearch() {
        searchButton.click();
    }
    public String getSearchResult(){
        return unitName.getText();
    }
    public boolean checkSearchResult(){
        if(getSearchResult().contains(searchInput.getText())){
            return true;
        }
        else return false;
    }
    /***get Edit Button***/
    public EditUnitPage openEditPage(){
        settingIcon.click();
        editButton.click();
        return new EditUnitPage(driver);
    }
    /***get toggle activation Button***/
    public void toggleActivateUnit(){
        settingIcon.click();
        toggleButton.click();
        approveMsg.click();
    }

}
