package Pages.AdminPortal;

import CoreElements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;

    /*** Login Page Locators ***/
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public TextBox emailTextBox = new TextBox(By.id("login-email"));

    public TextBox passwordTextBox = new TextBox(By.id("login-password"));
    public Button loginBtn = new Button(By.className("trigger-spinner"));
    public Label errorMessage = new Label(By.className("error-block"));

    /*** Check Login Error Text Message ***/
    public boolean checkErrorMessage() {
       errorMessage.waitImplicitly(20);
        System.out.println(errorMessage.getText());
        return errorMessage.getLabel().equals("Login Failed");
    }

    /*** Fill Login page inputs by invalid data ***/
    public void fillDataForInvalidLogin() {
        emailTextBox.typeText("test70@gmail.com");
        passwordTextBox.typeText("wrong pass");
        loginBtn.click();
    }
    /*** Fill Login page inputs by valid data ***/
    public void fillDataForValidLogin(String successMail, String successPassword) {
        emailTextBox.typeText(successMail);
        passwordTextBox.typeText(successPassword);
        loginBtn.click();

    }
}

