package Pages;

import CoreElements.Button;
import Pages.UserPages.UsersPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideMenu {
    private WebDriver driver;

    /*** UnitDetails Page Locators ***/
    public SideMenu(WebDriver driver) {
        this.driver = driver;
    }

    /***Side menu buttons***/
    /**Get users Label**/
    Button users=new Button(By.xpath("//*[@id=\"lg-menu\"]/li[2]/a"));
    /**Side menu Actions**/
    public UsersPage openUsersPage(){
        users.click();
        return new UsersPage(driver);
    }
}
