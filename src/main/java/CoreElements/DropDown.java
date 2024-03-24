package CoreElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Element {
    public DropDown(WebDriver webDriver) {
        super();
    }

    public void selectCurrency(String visibleText){
        Select currencies = new Select(webDriver.findElement(By.name("customerCurrency")));
        currencies.selectByVisibleText(visibleText);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].style.backgroundColor='#00F700'", webDriver.findElement(By.name("customerCurrency")));
    }
    public void selectDay(String day) {
        Select Days = new Select(webDriver.findElement(By.name("DateOfBirthDay")));
        Days.selectByVisibleText(day);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].style.backgroundColor='#00F700'", webDriver.findElement(By.name("DateOfBirthDay")));
    }

    public void selectMonth(String month) {
        Select months = new Select(webDriver.findElement(By.name("DateOfBirthMonth")));
        months.selectByVisibleText(month);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].style.backgroundColor='#00F700'", webDriver.findElement(By.name("DateOfBirthMonth")));
    }

    public void selectYear(String year) {
        Select years = new Select(webDriver.findElement(By.name("DateOfBirthYear")));
        years.selectByVisibleText(year);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].style.backgroundColor='#00F700'",webDriver.findElement(By.name("DateOfBirthYear")));
    }
    public void selectCountry(String country){
        Select countries = new Select(webDriver.findElement(By.id("BillingNewAddress_CountryId")));
        countries.selectByVisibleText(country);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].style.backgroundColor='#00F700'", webDriver.findElement(By.name("DateOfBirthYear")));
    }

}
