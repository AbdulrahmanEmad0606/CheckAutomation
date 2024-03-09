package CoreElements;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
    static WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public Driver() {
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--disable-notifications--");
            webDriver = new ChromeDriver(options);
    }
    public void maximizeWindow() {
        webDriver.manage().window().maximize();
    }

    public void goTo(String url) {
        webDriver.get(url);
    }

    public void tearDown() {
        webDriver.quit();
    }
}
