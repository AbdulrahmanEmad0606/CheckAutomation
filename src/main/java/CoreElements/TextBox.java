package CoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TextBox extends Element {
    // constructor
    public TextBox(By typedElement) {
        this.setLocator(typedElement);
    }

    // Type method
    public void typeText(String txt) {
        highlightElements();
        webDriver.findElement(locator).sendKeys(txt);
    }
    public void clearText(){
        highlightElements();
        webDriver.findElement(locator).clear();
    }

}
