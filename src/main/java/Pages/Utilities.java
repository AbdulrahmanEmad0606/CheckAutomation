package Pages;

import CoreElements.Driver;
import CoreElements.Element;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;

public class Utilities {
    public Driver webDriver;

    public Utilities(Driver webDriver) {
        this.webDriver = webDriver;
        Element.setWebDriver(webDriver.getWebDriver());
    }

    /****************  open the user portal *******************/
    public void openSite() {
        webDriver.goTo("http://youxeldev.eastus.cloudapp.azure.com/Check/Portal/Account/Login");
        webDriver.maximizeWindow();
    }

    /**************** Switch to new tab *******************/
    public void switchToNewTab() {
        String mainWindowHandle = webDriver.getWebDriver().getWindowHandle();
        Set<String> allWindowHandles = webDriver.getWebDriver().getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                webDriver.getWebDriver().switchTo().window(ChildWindow);
            }
        }
    }

    /**************** Switch to first tab *******************/
    public void switchToFirstTab() {
        String currentWindowHandle = webDriver.getWebDriver().getWindowHandle();
        Set<String> windowHandles = webDriver.getWebDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (windowHandle.equals(currentWindowHandle)) {
                continue; // Skip the current window
            }
            webDriver.getWebDriver().switchTo().window(windowHandle);
            break;
        }
    }

    /**************** Get Random Elements *******************/
    public int getRandomElement1() {
        int max = 2;
        int min = 0;
        return  (int) (Math.random() * (max - min + 1) + min);
    }
    public int getRandomSubElement1() {
        int max = 2;
        int min = 0;
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public int getRandomSubElement2() {
        int max2 = 5;
        int min2 = 3;
        return (int) (Math.random() * (max2 - min2 + 1) + min2);
    }

    public int getRandomSubElement3() {
        int max3 = 8;
        int min3 = 6;
        return (int) (Math.random() * (max3 - min3 + 1) + min3);
    }
    /************************************************************/

    public static void highlightElement(Driver driver, Element element) {
        // Use JavaScript to apply a temporary style change to highlight the element
        JavascriptExecutor js = (JavascriptExecutor) driver.getWebDriver();
        js.executeScript("arguments[0].style.border='2px solid red'", element);

        // Pause for a short time to see the highlighted element
        try {
            Thread.sleep(1000); // 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].style.border=''", element);
    }
}
