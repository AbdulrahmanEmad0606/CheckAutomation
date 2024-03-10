package Pages;

import CoreElements.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnitDetailsPage {
    private WebDriver driver;

    /*** UnitDetails Page Locators ***/
    public UnitDetailsPage(WebDriver driver) {
        this.driver = driver;
    }
    Label unitName=new Label(By.className("title-name"));

    /*** UnitDetails Page Actions ***/
    public String getUnitName(){
        return unitName.getText();
    }
    public boolean checkCreatedUnit(String filledUnitName){
        if (getUnitName().equalsIgnoreCase(filledUnitName))return true;
        else return false;
    }
}
