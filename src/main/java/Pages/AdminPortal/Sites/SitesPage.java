package Pages.AdminPortal.Sites;

import CoreElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SitesPage {
    private WebDriver driver;

    /*** SitesPage Locators ***/
    public SitesPage(WebDriver driver) {
        this.driver = driver;
    }
    public Button addSiteBtn=new Button(By.className("title-add-icon"));
    /*** SitesPage Page Actions ***/

    /**navigate to the create new site page**/
    public AddSitePage navigateToCreationPage(){
        addSiteBtn.click();
        return new AddSitePage(driver);
    }
}
