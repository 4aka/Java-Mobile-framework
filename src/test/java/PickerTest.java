import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AppTabs;
import pages.PickerPage;

import static keywords.Waiters.waitUntilVisible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertTrue;

public class PickerTest extends BaseTest {

    private AppTabs tab;
    private PickerPage page;

    @BeforeMethod
    public void setup() {
        tab = new AppTabs();
        page = new PickerPage();

        tab.openPicker();
    }


    @Test(priority = 1)
    public void isPickerScreenDisplayed() {
        waitUntilVisible(page.number_picker);
        assertTrue(page.number_picker.isDisplayed());
    }

    @Test(priority = 2)
    public void scrollPickerOptions() {
        page.picker_option.click();
        String pickerOptionName = page.picker_option.getText();

        assertThat(page.picker_input.getText(), equalTo(pickerOptionName));
    }

    @Test(priority = 3)
    public void checkTheValueMessage() {
        page.picker_option.click();
        String pickerOptionName = "テスト";

        assertThat(page.message_value.getText(), containsString(pickerOptionName));
    }

}
