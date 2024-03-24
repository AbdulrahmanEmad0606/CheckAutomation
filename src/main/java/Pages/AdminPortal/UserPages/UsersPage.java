package Pages.AdminPortal.UserPages;

import CoreElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersPage {
    private WebDriver driver;

    /*** Users Page Locators ***/
    public UsersPage(WebDriver driver) {
        this.driver = driver;
    }
    public Button addIcon=new Button(By.className("title-add-icon"));

    Button settingIcon=new Button(By.xpath("//*[@id=\"pagination-table\"]/tbody/tr[1]/td[9]"));
    Button editButton=new Button(By.xpath("//tbody/tr[1]/td[9]/div/div/div/form[1]/button"));
    Button changePasswordButton=new Button(By.xpath("//tbody/tr[1]/td[9]/div/div/div/form[2]/button"));


    /*** Users Page Actions ***/
    public CreateUserPage openUserForm(){
        addIcon.click();
        return new CreateUserPage(driver);
    }
    public EditUserPage openEditPage(){
        settingIcon.click();
        editButton.click();
        return new EditUserPage(driver);
    }
    public ChangePasswordPage openChangePasswordPage(){
        settingIcon.click();
        changePasswordButton.click();
        return new ChangePasswordPage(driver);
    }
    public boolean checkPageTitle(){
        return driver.getTitle().equalsIgnoreCase("Check Plus - Users");
    }
}
