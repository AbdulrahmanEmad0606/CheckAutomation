package Pages.UnitPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateUnitPage {
    private WebDriver driver;

    /*** units Page Locators ***/
    public CreateUnitPage(WebDriver driver) {
        this.driver = driver;
    }
    private By primaryNameInput = By.id("Name");
    private By secondaryNameInput = By.id("NameAr");
    private By unitManagerSelect = By.id("SelectedUnitManager");
    private By unitCodeInput = By.id("ShortCode");
    private By primaryDescriptionTextarea = By.id("Description");
    private By secondaryDescriptionTextarea = By.id("DescriptionAr");
    private By emailInput = By.id("Email");
    private By redirectionModeJeha = By.id("jehaRadioButton");
    private By redirectionModeRepresentative = By.id("RepresentativeRadioButton");

    public By saveButton = By.xpath(("//label[@type='submit']"));
    // Methods to interact with the page
    public void enterPrimaryName(String name) {
        driver.findElement(primaryNameInput).sendKeys(name);
    }

    public void enterSecondaryName(String name) {
        driver.findElement(secondaryNameInput).sendKeys(name);
    }

    public void selectUnitManager(String managerName) {
        new Select(driver.findElement(unitManagerSelect)).selectByVisibleText(managerName);
    }

    public void enterUnitCode(String code) {
        driver.findElement(unitCodeInput).sendKeys(code);
    }

    public void enterPrimaryDescription(String description) {
        driver.findElement(primaryDescriptionTextarea).sendKeys(description);
    }

    public void enterSecondaryDescription(String description) {
        driver.findElement(secondaryDescriptionTextarea).sendKeys(description);
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void setRedirectionModeJeha() {
        driver.findElement(redirectionModeJeha).click();
    }

    public void setRedirectionModeRepresentative() {
        driver.findElement(redirectionModeRepresentative).click();
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }

    // A method that wraps the actions needed to fill the form and submit it
    public UnitDetailsPage addUnit(String primaryName, String secondaryName, String managerName, String code, String primaryDescription, String secondaryDescription, String email, boolean isJeha) {
        enterPrimaryName(primaryName);
        enterSecondaryName(secondaryName);
        selectUnitManager(managerName);
        enterUnitCode(code);
        enterPrimaryDescription(primaryDescription);
        enterSecondaryDescription(secondaryDescription);
        enterEmail(email);
        if (isJeha) {
            setRedirectionModeJeha();
        } else {
            setRedirectionModeRepresentative();
        }
        clickSave();
        return new UnitDetailsPage(driver);
    }
}
