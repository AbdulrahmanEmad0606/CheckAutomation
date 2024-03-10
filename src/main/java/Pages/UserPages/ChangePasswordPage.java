package Pages.UserPages;

import CoreElements.Button;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.Buffer;

public class ChangePasswordPage {
    /**ChangePasswordPage locators**/
    private WebDriver driver;
    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
    }
    public TextBox newPassword=new TextBox(By.id("NewPassword"));
    public TextBox newPasswordConfirm=new TextBox(By.id("NewPasswordConfirm"));
    public Button saveButton=new Button(By.xpath(("//label[@type='submit']")));
    /**ChangePasswordPage Actions**/
    public UsersPage changePass(String pass,String confirmPass){
        newPassword.typeText(pass);
        newPasswordConfirm.typeText(confirmPass);
        saveButton.click();
        return new UsersPage(driver);
    }
}
