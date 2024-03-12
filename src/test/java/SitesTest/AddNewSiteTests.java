package SitesTest;

import GlobalSetup.GlobalSetup;
import LoginTest.LoginTests;
import Pages.SideMenu;
import Pages.Sites.AddSitePage;
import Pages.Sites.SiteDetails;
import Pages.Sites.SitesPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddNewSiteTests extends GlobalSetup {
    LoginTests loginTests=new LoginTests();
    SideMenu sideMenu=new SideMenu(driver.getWebDriver());
    SitesPage sitesPage=new SitesPage(driver.getWebDriver());
    AddSitePage addSitePage=new AddSitePage(driver.getWebDriver());
    SiteDetails siteDetails=new SiteDetails(driver.getWebDriver());
    @BeforeTest
    public void checkLogin(){
        loginTests.testSuccessfulLogin();
        sideMenu.openSitesPage();
        sitesPage.navigateToCreationPage();
        addSitePage.createNewSite("Test Site99","موقع تجريبي","12356","2");
    }
    @Test
    public void testAddNewSite() {
        Assert.assertTrue(siteDetails.checkPageTitle(),"In valid search result");
    }

}
