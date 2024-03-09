package CoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link extends Element{
    static WebDriver driver;
    public Link(By link){
        this.setLocator(link);
    }
    //Actions
    public void click(){
        highlightElements();
        webDriver.findElement(locator).click();
    }

}
