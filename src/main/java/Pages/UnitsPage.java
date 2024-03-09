package Pages;

import CoreElements.Image;
import CoreElements.Link;
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
    By searchInput = By.id("filter");
    By searchButton = By.className("search-btn");
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
    public void setSearchTerm(String searchTerm) {
        driver.findElement(searchInput).sendKeys(searchTerm);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

}
