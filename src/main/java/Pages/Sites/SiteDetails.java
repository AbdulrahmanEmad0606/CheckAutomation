package Pages.Sites;

import org.openqa.selenium.WebDriver;

public class SiteDetails {
    private WebDriver driver;
    /*** SiteDetails Locators ***/
    public SiteDetails(WebDriver driver) {
        this.driver = driver;
    }

    /***SiteDetails Actions***/
    public boolean checkPageTitle(){
        return driver.getTitle().equalsIgnoreCase("Check Plus - Site Details");
    }

}
