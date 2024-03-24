package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocationPage {

    private WebDriver driver;

    /*** Location Page Locators ***/
    public LocationPage(WebDriver driver) {
        this.driver = driver;
    }
    RadioButton radioButton=new RadioButton(By.cssSelector("div.node-radio-button.mx-1.position-relative"));
    Button nextBtn=new Button(By.cssSelector("button.chk-btn.chk-primary-btn[title='Next']"));
    public CheckList navigateToCheckList(){
        radioButton.radioBtnClick();
        nextBtn.click();
        return new CheckList(driver);
    }
}
