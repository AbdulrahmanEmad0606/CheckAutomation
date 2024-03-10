package CoreElements;

import org.openqa.selenium.By;

public class Label extends Element{
    //constructor
    public Label(By label){
        this.setLocator(label);
    }
    public String getLabel(){
        waitExplicitly(locator);
        highlightElements();
        return webDriver.findElement(locator).getText();
    }
}
