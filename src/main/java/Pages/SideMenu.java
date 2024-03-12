package Pages;

import CoreElements.Button;
import Pages.Sites.SitesPage;
import Pages.UserPages.UsersPage;
import Pages.WorkflowPages.WorkflowsPage;
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
    Button workflows=new Button(By.xpath("//*[@id=\"lg-menu\"]/li[7]/a"));
    Button sites=new Button(By.xpath("//*[@id=\"lg-menu\"]/li[5]/a"));
    /**Side menu Actions**/
    public UsersPage openUsersPage(){
        users.click();
        return new UsersPage(driver);
    }
    public WorkflowsPage openWorkflowsPage(){
        workflows.click();
        return new WorkflowsPage(driver);
    }
    public SitesPage openSitesPage(){
        sites.click();
        return new SitesPage(driver);
    }
}
