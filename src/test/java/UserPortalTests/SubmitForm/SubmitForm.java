package UserPortalTests.SubmitForm;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.LoginPage;
import org.testng.annotations.Test;

public class SubmitForm extends GlobalSetup {

    LoginPage loginPage=new LoginPage(driver.getWebDriver());
    @Test
    public void submitChecklist(){
        loginPage.fillLoginForm("auto_user","123456").openForm().selectEvent().navigateToCheckList().fillForm();
    }
}
