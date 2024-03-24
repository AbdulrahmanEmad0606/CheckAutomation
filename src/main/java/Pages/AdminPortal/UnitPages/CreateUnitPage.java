package Pages.AdminPortal.UnitPages;

import CoreElements.Button;
import CoreElements.CheckBox;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateUnitPage {
    private WebDriver driver;

    /*** units Page Locators ***/
    public CreateUnitPage(WebDriver driver) {
        this.driver = driver;
    }
    private TextBox primaryNameInput = new TextBox(By.id("Name"));
    private TextBox secondaryNameInput = new TextBox(By.id("NameAr"));
    private By unitManagerSelect = By.id("SelectedUnitManager");
    private TextBox unitCodeInput = new TextBox(By.id("ShortCode"));
    private TextBox primaryDescriptionTextarea =new TextBox(By.id("Description"));
    private TextBox secondaryDescriptionTextarea= new TextBox (By.id("DescriptionAr"));
    private TextBox emailInput =new TextBox(By.id("Email"));
    private CheckBox redirectionModeJeha =new CheckBox(By.id("jehaRadioButton"));
    private CheckBox redirectionModeRepresentative = new CheckBox(By.id("RepresentativeRadioButton"));
    private Button saveButton = new Button(By.xpath(("//label[@type='submit']")));


    /*** units Page Actions ***/
    public UnitDetailsPage addUnit(String primaryName, String secondaryName, String managerName, String code, String primaryDescription, String secondaryDescription, String email, boolean isJeha) {
        primaryNameInput.typeText(primaryName);
        secondaryNameInput.typeText(secondaryName);
        new Select(driver.findElement(unitManagerSelect)).selectByVisibleText(managerName);
        unitCodeInput.typeText(code);
        primaryDescriptionTextarea.typeText(primaryDescription);
        secondaryDescriptionTextarea.typeText(secondaryDescription);
        emailInput.typeText(email);
        if (isJeha) {
            redirectionModeJeha.click();
        } else {
            redirectionModeRepresentative.click();
        }
        saveButton.click();
        return new UnitDetailsPage(driver);
    }
}
