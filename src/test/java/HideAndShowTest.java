import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppTabs;
import pages.HideAndShowPage;

import static keywords.Waiters.waitUntilVisible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertTrue;

public class HideAndShowTest extends BaseTest {

    private AppTabs tab;
    private HideAndShowPage page;

    @BeforeMethod
    public void setup() {
        tab = new AppTabs();
        page = new HideAndShowPage();

        tab.openHideAndShowTab();
    }

    @Test
    public void areElementsVisible() {
        assertTrue(page.button_1.isDisplayed());
        assertTrue(page.hide_button_2.isDisplayed());
        assertTrue(page.textArea1.isDisplayed());
        assertTrue(page.textArea2.isDisplayed());
    }

    @Test
    public void hideTextElements() {
        page.button_1.click();

        assertThat(page.button_1.getText().toLowerCase(), equalTo("show"));
    }

    @Test
    public void showTextElements() {
        assertThat(page.button_1.getText().toLowerCase(), equalTo("hide"));
        page.button_1.click();

        assertThat(page.button_1.getText().toLowerCase(), equalTo("show"));
        page.button_1.click();

        assertTrue(page.textArea1.isDisplayed());
    }

}
