package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    /*** Home Page Locators ***/
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    Label greetingMSG=new Label(By.xpath("//span[contains(@class,'greeting')]"));
    Button addButton=new Button(By.xpath("//span[@title='Add']"));
    public boolean getGreetingLabel(){
        greetingMSG.waitImplicitly(5);
        return greetingMSG.isDisplayed(By.xpath("//span[contains(@class,'greeting')]"));
    }
    public AddNewReportPage openForm(){
        addButton.waitImplicitly(5);
        addButton.click();
        return new AddNewReportPage(driver);
    }
}
