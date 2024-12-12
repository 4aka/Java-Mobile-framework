import org.testng.annotations.*;
import pages.PopupMenuPage;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.*;

public class PopupMenuTest extends BaseTest{

    PopupMenuPage page = new PopupMenuPage();

    @BeforeClass
    public void setup() {
        tab.openPopupMenu();
    }

    @Test
    public void openThePopupList() {
        page.make_a_popup.click();

        assertTrue(page.popup_list.isDisplayed());
    }

    @Test
    public void selectPopupSearchOption() {
        final String toast_message = "Clicked popup menu item Search";

        page.make_a_popup.click();
        page.search_option.click();

        assertThat(page.toast.getText(), equalTo(toast_message));

    }

    @Test
    public void selectPopupEditOption() {
        final String toast_message = "Clicked popup menu item Share";

        page.make_a_popup_button.click();
        page.edit_option.click();
        page.share_option.click();

        assertThat(page.toast.getText(), equalTo(toast_message));
    }
}
