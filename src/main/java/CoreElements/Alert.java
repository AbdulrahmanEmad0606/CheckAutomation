package CoreElements;

import org.openqa.selenium.By;

public class Alert extends Element {
    //Actions
    public String getAlertText(){
        //highlightElements();
        return webDriver.switchTo().alert().getText();
    }

}
