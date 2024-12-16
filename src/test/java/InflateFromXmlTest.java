import keywords.AppActions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppMenuPage;
import pages.AppTabs;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertTrue;

public class InflateFromXmlTest extends BaseTest {

    private AppTabs tab;
    private AppMenuPage page;


    @BeforeMethod
    public void setup() {
        tab = new AppTabs();
        page = new AppMenuPage();

        tab.openAppMenu();
    }

    @Test
    public void openDropdown() {
        page.inflate_from_xml_button.click();
        page.spinner.click();

        assertTrue(page.textViewListValue(0).isDisplayed());
        assertThat(page.textViewListValue(0).getText(), equalTo("Title only"));
    }

    @Test
    public void openMoreOptionsMenu() {
        page.more_options.click();

        assertTrue(page.layoutListValue(0).isDisplayed());
    }

    @Test
    public void selectMoreOptionsValue() {
        page.more_options.click();
        page.happy_option.click();

        assertThat(AppActions.getPageSource(), containsString("Happy"));
    }

}
