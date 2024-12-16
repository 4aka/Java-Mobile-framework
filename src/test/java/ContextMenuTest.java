import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppTabs;
import pages.ContextMenuPage;

import static keywords.AppActions.getPageSource;
import static keywords.AppActions.longClick;
import static keywords.Waiters.waitUntilVisible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.testng.Assert.assertTrue;

public class ContextMenuTest extends BaseTest{

    private AppTabs tab;
    private ContextMenuPage page;

    @BeforeMethod
    public void setup() {
        tab = new AppTabs();
        page = new ContextMenuPage();

        tab.openContextMenu();
    }


    @Test
    public void screenTitleIsDisplayed() {
        assertTrue(page.screen_title.isDisplayed());
    }

    @Test
    public void longPressTheButton() {
        longClick(page.long_press_button);

        waitUntilVisible(page.list_view);
        assertTrue(page.list_view.isDisplayed());
    }

    @Test
    public void selectContextMenuOption() {
        longClick(page.long_press_button);
        waitUntilVisible(page.list_view);
        page.menu_a_option.click();

        assertThat(getPageSource(), containsString("Item 1a was chosen"));
    }

}
