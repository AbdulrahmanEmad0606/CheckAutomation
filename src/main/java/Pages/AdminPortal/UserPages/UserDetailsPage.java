package Pages.AdminPortal.UserPages;

import org.openqa.selenium.WebDriver;

public class UserDetailsPage {
    private WebDriver driver;

    /*** Users Page Locators ***/
    public UserDetailsPage(WebDriver driver) {
        this.driver = driver;
    }
    /*** Users Page Actions ***/
    /**Get page title**/
    public boolean checkPageTitle(){
        return driver.getTitle().equalsIgnoreCase("Check Plus - User Details");
    }
}
