package CoreElements;

import org.openqa.selenium.By;

public class Button extends Element{
    //constructor
    public Button(By button){
        this.setLocator(button);
    }
    //Actions
    public void click(){
        webDriver.findElement(locator).click();
    }
}
