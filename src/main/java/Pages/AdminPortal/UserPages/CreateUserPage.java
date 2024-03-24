package Pages.AdminPortal.UserPages;

import CoreElements.Button;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateUserPage {
    private WebDriver driver;
    public CreateUserPage(WebDriver driver) {
        this.driver = driver;
    }
    /*** Users Page Locators ***/

    // Locators
    private TextBox fullNameInput = new TextBox(By.id("FullName"));
    private TextBox usernameInput = new TextBox(By.id("Username"));
    private TextBox userCodeInput = new TextBox(By.id("UserCode"));
    private TextBox emailInput = new TextBox(By.id("Email"));
    private TextBox mobileInput = new TextBox(By.id("Mobile"));
    private By jobDropdown = By.id("role");
    private By unitDropdown = By.id("unit");
    private Button submitButton = new Button(By.id("create-activity"));



    public UserDetailsPage fillOutForm(String fullName, String username, String userCode, String email, String mobile, String jobName, String unitName) {
        fullNameInput.typeText(fullName);
        usernameInput.typeText(username);
        userCodeInput.typeText(userCode);
        emailInput.typeText(email);
        mobileInput.typeText(mobile);
        new Select(driver.findElement(jobDropdown)).selectByVisibleText(jobName);
        new Select(driver.findElement(unitDropdown)).selectByVisibleText(unitName);
        submitButton.click();
        return new UserDetailsPage(driver);
    }
}
