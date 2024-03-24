package Pages.AdminPortal.Sites;

import CoreElements.Button;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddSitePage {
    private WebDriver driver;

    /*** AddSitePage Locators ***/
    public AddSitePage(WebDriver driver) {
        this.driver = driver;
    }
    private TextBox nameLocator =new TextBox(By.id("Name"));
    private TextBox secondaryNameLocator = new TextBox(By.id("NameAr"));
    private TextBox codeLocator =new TextBox(By.id("ShortCode"));
    private By typeLocator = By.id("LocationType");
    private Button saveButton = new Button(By.xpath(("//label[@type='submit']")));

    public void selectType(String value) {
        WebElement dropdown = driver.findElement(typeLocator);
        dropdown.findElement(By.xpath("//option[@value='" + value + "']")).click();
    }

    public SiteDetails createNewSite(String name,String name2,String code,String val) {
        nameLocator.typeText(name);
        secondaryNameLocator.typeText(name2);
        codeLocator.typeText(code);
        selectType(val);
        saveButton.click();
        return new SiteDetails(driver);
    }

}
