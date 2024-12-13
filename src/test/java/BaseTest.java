import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.AppTabs;

import static framework.InitDriver.driverQuit;
import static framework.InitDriver.getDriver;


public class BaseTest {

    @BeforeMethod
    public void beforeMethod() {
    }

    @AfterMethod
    public void afterMethod() {
        driverQuit();
    }

}
