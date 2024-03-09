package CoreElements;

import org.openqa.selenium.By;

public class Image extends Element {
    public Image(By label){
        this.setLocator(label);
    }
    public String getPath(){
        highlightElements();
        return webDriver.findElement(locator).getAttribute("src");
    }
}
