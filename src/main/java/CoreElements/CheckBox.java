package CoreElements;

import Pages.Utilities;
import org.openqa.selenium.By;

public class CheckBox extends Element{
    public CheckBox(By checkBox){
        this.setLocator(checkBox);
    }
    //Actions
    public void click(){
        highlightElements();
        webDriver.findElement(locator).click();
    }
}
