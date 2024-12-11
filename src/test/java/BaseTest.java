import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.AppTabs;


public class BaseTest {

    public AppTabs tab = new AppTabs();

    @BeforeClass
    public void setup() {

    }

    @AfterClass
    public void after() {

    }
}
