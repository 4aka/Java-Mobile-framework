import enums.SingleChoiceList;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AlertDialogPage;
import pages.AppTabs;

import static keywords.Assertions.isElementDisplayedSoft;
import static keywords.Waiters.waitUntilVisible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Log4j2
public class AlertDialogsTest extends BaseTest {

    private AppTabs tab;
    private AlertDialogPage page;

    @BeforeMethod
    public void setup() {
        tab = new AppTabs();
        page = new AlertDialogPage();

        tab.openDialogs();
    }

    @Test
    public void getAlertMessage() {
        page.openOkCancelDialogWithMessage();
        waitUntilVisible(page.alert_title);
        String message = page.alert_title.getText();

        assertThat(message, equalTo(page.okCancelDialogWithMessageText));
    }

    @Test
    public void closeDialogWindowByOk() {
        page.openOkCancelDialogWithMessage();
        waitUntilVisible(page.alert_title);
        page.dialog_window_Ok_button.click();

        assertFalse(isElementDisplayedSoft(page.alert_title));
    }

    @Test
    public void closeDialogWindowByCancel() {
        page.openOkCancelDialogWithMessage();
        waitUntilVisible(page.alert_title);
        page.dialog_window_cancel_button.click();

        assertFalse(isElementDisplayedSoft(page.alert_title));
    }

    @Test
    public void getListDialogWindow() {
        page.list_dialogue_button.click();
        waitUntilVisible(page.alert_title);

        assertTrue(page.alert_title.isDisplayed());
    }

    @Test
    public void selectListDialogValue() {
        final int elementNumber = 2;

        page.list_dialogue_button.click();
        waitUntilVisible(page.alert_title);
        page.selectItem(elementNumber);
        String message = page.list_dialogue_message.getText();

        assertThat(message, equalTo(page.getListDialogueMessage(elementNumber)));
    }

    @Test
    public void getSingleChoiceListWindow() {
        page.single_choice_list.click();
        waitUntilVisible(page.alert_title);
        assertTrue(page.alert_title.isDisplayed());
        page.chooseElementSingleChoiceList(SingleChoiceList.MAP);
        page.dialog_window_Ok_button.click();

        assertFalse(isElementDisplayedSoft(page.alert_title));
    }

}
