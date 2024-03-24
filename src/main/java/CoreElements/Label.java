package CoreElements;

import org.openqa.selenium.By;

public class Label extends Element{
    //constructor
    public Label(By label){
        this.setLocator(label);
    }
    public String getLabel(){
        highlightElements();
        return webDriver.findElement(locator).getText();
    }
    public void click(){
        webDriver.findElement(locator).click();
    }
}
