package Pages.UserPages;

import CoreElements.Button;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EditUserPage {
    private WebDriver driver;

    /*** Users Page Locators ***/

    // Locators
    private TextBox fullNameInput = new TextBox(By.id("FullName"));
    public Button saveButton =new Button(By.xpath(("//label[@type='submit']")));

    public EditUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public UserDetailsPage fillOutForm(String fullName) {
        fullNameInput.clearText();
        fullNameInput.typeText(fullName);
        saveButton.click();
        return new UserDetailsPage(driver);
    }
    public boolean checkPageTitle(){
        return driver.getTitle().equalsIgnoreCase("Check Plus - Edit User");
    }
}
