import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static framework.InitDriver.driverQuit;


public class BaseTest {

    @BeforeMethod
    public void beforeMethod() {
    }

    @AfterMethod
    public void afterMethod() {
        driverQuit();
    }

}
