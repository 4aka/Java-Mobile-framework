import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.AppTabs;


public class BaseTest {

    public AppTabs tab = new AppTabs();

    @BeforeClass
    public void beforeClass() {

    }

    @BeforeTest
    public void beforeTest() {

    }

    @AfterTest
    public void afterTest() {

    }

    @AfterClass
    public void afterClass() {

    }
}
