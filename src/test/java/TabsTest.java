import org.testng.annotations.*;
import pages.AppTabs;
import pages.TabsPage;

import static keywords.Waiters.waitUntilVisibleElement;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.*;

public class TabsTest extends BaseTest {

    private AppTabs tab;
    private TabsPage page;

    @BeforeMethod
    public void setup() {
        tab = new AppTabs();
        page = new TabsPage();

        tab.openViews();
        tab.openTabs();
    }

    @Test
    public void getContentByIdDisplayed() {
        page.content_by_id.click();

        assertTrue(page.tabs_bar.isDisplayed());
    }

    @Test
    public void selectTabInContentByIdMenu() {
        page.content_by_id.click();
        page.tab_one.click();
        String tabOneViewText = "tab1";

        assertThat(page.tab_one_view.getText(), equalTo(tabOneViewText));
    }

    @Test
    public void getContentByIntentDisplayed() {
        page.content_by_intent.click();
        page.tabs_bar.click();

        assertTrue(page.tabs_bar.isDisplayed());
    }

    @Test
    public void addNewPhotoInPhotoListTab() {
        page.content_by_intent.click();
        waitUntilVisibleElement(page.photo_list).click();
        page.clickNewPhotoByCoordinates();

        // TODO Appium does not see elements [images]
        // Note: In that case ask devs about elements. Add id
        // assertTrue(page.image_view.isDisplayed());
    }

}
