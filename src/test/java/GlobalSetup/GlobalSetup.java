package GlobalSetup;

import CoreElements.Driver;
import Pages.Utilities;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GlobalSetup {
    public static Driver driver = new Driver();
    public static Utilities utilities = new Utilities(driver);

    @BeforeTest
    public void setUp() {
        utilities.openSite();
        utilities = new Utilities(driver);
    }

//    @AfterTest
//    public void closeSite() {
//        driver.tearDown();
//    }
}
