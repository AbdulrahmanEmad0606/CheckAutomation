package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckList {

    private WebDriver driver;

    public CheckList(WebDriver driver) {
        this.driver = driver;
    }

    Button calendarInput = new Button(By.cssSelector("p-calendar[class*='chk-calendar'] input"));

    TextBox textInput = new TextBox(By.cssSelector("chk-input-text input.chk-input-text"));

    Button submitButton = new Button(By.xpath("//chk-button[2]/button/span"));

    TextBox attachmentButton = new TextBox(By.cssSelector("chk-attatchment input[type='file']"));

    Button gpsField = new Button(By.cssSelector(".chk-map-leaflet.leaflet-container"));
    public void fillForm() {
        calendarInput.click();
        textInput.typeText("Example Text");
        attachmentButton.typeText("C:/Users/DELL/Pictures/images/Test.PNG");
        gpsField.click();
        submitButton.click();
    }
}
