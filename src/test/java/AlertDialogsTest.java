import framework.Assertions;
import io.appium.java_client.AppiumBy;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AlertDialogPage;

import static framework.Assertions.*;
import static framework.InitDriver.getDriver;
import static framework.Waiters.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

@Log4j2
public class AlertDialogsTest extends BaseTest {

    private final AlertDialogPage page = new AlertDialogPage();

    @BeforeTest
    public void setUp() {
        new AlertDialogPage().openDialogs();
    }

    @Test
    public void getAlertMessage() {
        page.openOkCancelDialogWithMessage();
        waitUntilVisible(page.dialog_window_message);
        String message = page.dialog_window_message.getText();

        assertThat(message, equalTo(page.okCancelDialogWithMessageText));
    }

    @Test
    public void closeDialogWindowByOk() {
        page.openOkCancelDialogWithMessage();
        waitUntilVisible(page.dialog_window_message);
        page.dialog_window_Ok_button.click();

        assertFalse(isElementDisplayedSoft(page.alert_title));
    }

    @Test
    public void closeDialogWindowByCancel() {
        page.openOkCancelDialogWithMessage();
        waitUntilVisible(page.dialog_window_message);
        page.dialog_window_cancel_button.click();

        assertFalse(isElementDisplayedSoft(page.alert_title));
    }

    @Test
    public void getListDialogWindow() {
        page.list_dialogue_button.click();
        waitUntilVisible(page.list_dialogue_title);

        assertTrue(page.list_dialogue_title.isDisplayed());
    }

    @Test
    public void selectListDialogValue() {
        final int elementNumber = 2;

        page.list_dialogue_button.click();
        waitUntilVisible(page.list_dialogue_title);
        page.selectItem(elementNumber);

        String message = page.list_dialogue_message.getText();
        System.err.println(page.getListDialogueMessage(elementNumber));

        assertThat(message, equalTo(page.getListDialogueMessage(elementNumber)));
    }

    @Test
    public void getSingleChoiceListWindow() {
        WebElement singleChoiceList = getDriver().findElement(AppiumBy.accessibilityId("Single choice list"));
        singleChoiceList.click();

        WebElement singleChoiceListTitle = getDriver().findElement(AppiumBy.id("android:id/alertTitle"));

        assertTrue(singleChoiceListTitle.isDisplayed());
        getDriver().navigate().back();
    }

    @Test
    public void closeSingleChoiceList() {
        WebElement singleChoiceList = getDriver().findElement(AppiumBy.accessibilityId("Single choice list"));
        singleChoiceList.click();

        WebElement secondValue = getDriver().findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@index='1']"));
        secondValue.click();

        WebElement okButton = getDriver().findElement(AppiumBy.id("android:id/button1"));
        okButton.click();

        WebElement alertDialogsScreenTitle = getDriver().findElement(AppiumBy.className("android.widget.TextView"));

        assertTrue(alertDialogsScreenTitle.isDisplayed());
    }

}
