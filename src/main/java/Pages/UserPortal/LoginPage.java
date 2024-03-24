package Pages.UserPortal;
import CoreElements.Button;
import CoreElements.Label;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private WebDriver driver;

    /*** Login Page Locators ***/
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    TextBox userNameInput=new TextBox(By.xpath("//input[@placeholder='Enter your user name']"));
    TextBox passwordInput=new TextBox(By.xpath("//input[@placeholder='Enter your password']"));
    Button loginBtn=new Button(By.xpath("//button[contains(@class,'chk-btn')]"));
    Label invalidLoginMSG=new Label(By.xpath("//p[contains(@class,'error-text')]"));
    public HomePage fillLoginForm(String userName,String password){
        userNameInput.typeText(userName);
        passwordInput.typeText(password);
        loginBtn.click();
        return new HomePage(driver);
    }
    public boolean checkInvalidMSG(){

        invalidLoginMSG.waitImplicitly(5);
        System.out.println(invalidLoginMSG.getLabel());
        return invalidLoginMSG.getLabel().equals("The username or password is incorrect, please try again.");
    }
    public void fillDataForInvalidLogin() {
        userNameInput.typeText("test70@gmail.com");
        passwordInput.typeText("wrong pass");
        loginBtn.click();
    }
}
