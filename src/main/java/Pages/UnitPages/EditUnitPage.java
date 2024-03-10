package Pages.UnitPages;

import CoreElements.Button;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditUnitPage {
    private WebDriver driver;

    /*** units Page Locators ***/
    public EditUnitPage(WebDriver driver) {
        this.driver = driver;
    }
    private TextBox primaryNameInput =new TextBox(By.id("Name"));
    private TextBox secondaryNameInput =new TextBox(By.id("NameAr"));

    public Button saveButton =new Button(By.xpath(("//label[@type='submit']")));
    public UnitDetailsPage editUnit(String primaryNameInput1,String secondaryNameInput2){
        primaryNameInput.clearText();
        primaryNameInput.typeText(primaryNameInput1);
        secondaryNameInput.clearText();
        secondaryNameInput.typeText(secondaryNameInput2);
        saveButton.click();
        return new UnitDetailsPage(driver);
    }
}
